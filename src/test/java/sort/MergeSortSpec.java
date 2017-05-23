package sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sort.MergeSort;

/**
 * Created by user on 04.04.2017.
 */
public class MergeSortSpec {
    private static final int SIZE = 10;

    private int[] source = new int[SIZE];
    private int[] expected = new int[SIZE];
    private static MergeSort mergeSort;


    @BeforeClass
    public static void initTestClass(){
        mergeSort = new MergeSort();
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
        int[] actual = mergeSort.sort(source);
        Assert.assertEquals(expected.length, actual.length);
    }

    @Test
    public void givenArrayWhenSortedClassicThenResultSorted(){
        int[] actual =  mergeSort.sort(source);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void givenArrayWhenSortedOptimalThenTheSameLength(){
        int[] actual = mergeSort.optimalSort(source);
        Assert.assertEquals(expected.length, actual.length);
    }

    @Test
    public void givenArrayWhenSortedOptimalThenResultSorted(){
        int[] actual = mergeSort.optimalSort(source);
        Assert.assertArrayEquals(expected, actual);
    }

}
