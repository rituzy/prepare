package sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sort.QuickSort;

/**
 * Created by user on 02.04.2017.
 */
public class QuikSortSpec {

    private static final int SIZE = 10;

    private int[] source = new int[SIZE];
    private int[] expected = new int[SIZE];
    private static QuickSort quickSort;


    @BeforeClass
    public static void initTestClass(){
        quickSort = new QuickSort();
    }

    @Before
    public void prepareArrays(){
        for (int i = 0; i < SIZE; i++) {
            expected[i] = i;
            source[i] = SIZE - 1 - i;
        }
    }


    @Test
    public void givenArrayWhenSortedClassicThenTheSameLength(){
        int[] actual = quickSort.sort(source);
        Assert.assertEquals(expected.length, actual.length);
    }

    @Test
    public void givenArrayWhenSortedClassicThenResultSorted(){
        int[] actual =  quickSort.sort(source);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void givenArrayWhenSortedOptimalThenTheSameLength(){
        int[] actual = quickSort.sortOptimal(source);
        Assert.assertEquals(expected.length, actual.length);
    }

    @Test
    public void givenArrayWhenSortedOptimalThenResultSorted(){
        int[] actual = quickSort.sortOptimal(source);
        Assert.assertArrayEquals(expected, actual);
    }

}
