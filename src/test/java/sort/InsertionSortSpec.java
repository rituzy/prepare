package sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sort.InsertionSort;

/**
 * Created by user on 02.04.2017.
 */
public class InsertionSortSpec {
    private static final int SIZE = 10;

    private int[] source = new int[SIZE];
    private int[] expected = new int[SIZE];
    private static InsertionSort insertionSort;


    @BeforeClass
    public static void initTestClass(){
        insertionSort = new InsertionSort();
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
        insertionSort.swap(2,6,expected);
        Assert.assertEquals(expected2, expected[2]);
        Assert.assertEquals(expected6, expected[6]);
    }

    @Test
    public void givenArrayWhenSortedClassicThenTheSameLength(){
        int[] actual = insertionSort.sort(source);
        Assert.assertEquals(expected.length, actual.length);
    }


    @Test
    public void givenArrayWhenSortedClassicThenResultSorted(){
        int[] actual =  insertionSort.sort(source);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void givenArrayWhenSortedOptimalThenTheSameLength(){
        int[] actual = insertionSort.sortOptimal(source);
        Assert.assertEquals(expected.length, actual.length);
    }

    @Test
    public void givenArrayWhenSortedOptimalThenResultSorted(){
        int[] actual = insertionSort.sortOptimal(source);
        Assert.assertArrayEquals(expected, actual);
    }

}
