package sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sort.SelectionSort;

/**
 * Created by user on 02.04.2017.
 */
public class SelectionSortSpec {
    private static final int SIZE = 10;

    private int[] source = new int[SIZE];
    private int[] expected = new int[SIZE];
    private static SelectionSort compareSort;


    @BeforeClass
    public static void initTestClass(){
        compareSort = new SelectionSort();
    }

    @Before
    public void prepareArrays(){
        for (int i = 0; i < SIZE; i++) {
            expected[i] = i;
            source[i] = SIZE - 1 - i;
        }
    }

    @Test
    public void swapTest(){
        int expected2 = 6;
        int expected6 = 2;
        compareSort.swap(2,6,expected);
        Assert.assertEquals(expected2, expected[2]);
        Assert.assertEquals(expected6, expected[6]);
    }

    @Test
    public void givenArrayWhenSortedThenTheSameLength(){
        int[] actual = compareSort.sort(source);
        Assert.assertEquals(expected.length, actual.length);
    }
    @Test
    public void givenArrayWhenSortedThenResultSorted(){
        int[] actual =  compareSort.sort(source);
        Assert.assertArrayEquals(expected, actual);
    }

}
