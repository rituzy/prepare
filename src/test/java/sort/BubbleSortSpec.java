package sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sort.BubbleSort;

/**
 * Created by user on 02.04.2017.
 */

public class BubbleSortSpec {

    private static final int SIZE = 10;

    private int[] source = new int[SIZE];
    private int[] expected = new int[SIZE];
    private static BubbleSort bubbleSort;


    @BeforeClass
    public static void initTestClass(){
        bubbleSort = new BubbleSort();
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
        bubbleSort.swap(2,6,expected);
        Assert.assertEquals(expected2, expected[2]);
        Assert.assertEquals(expected6, expected[6]);
    }

    @Test
    public void givenArrayWhenSortedClassicThenTheSameLength(){
        int[] actual = bubbleSort.sort(source);
        Assert.assertEquals(expected.length, actual.length);
    }
    @Test
    public void givenArrayWhenSortedClassicThenResultSorted(){
        int[] actual =  bubbleSort.sort(source);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void givenArrayWhenSortedOptimalThenTheSameLength(){
        int[] actual = bubbleSort.sortOptimal(source);
        Assert.assertEquals(expected.length, actual.length);
    }

    @Test
    public void givenArrayWhenSortedOptimalThenResultSorted(){
        int[] actual = bubbleSort.sortOptimal(source);
        Assert.assertArrayEquals(expected, actual);
    }
}
