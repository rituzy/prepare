package sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sort.HeapSort;

/**
 * Created by user on 09.04.2017.
 */
public class HeapSortSpec {
    private static final int SIZE = 10;

    private int[] source = new int[SIZE];
    private int[] expected = new int[SIZE];
    private static HeapSort heapSort;


    @BeforeClass
    public static void initTestClass(){
        heapSort = new HeapSort();
    }

    @Before
    public void prepareArrays(){
        for (int i = 0; i < SIZE; i++) {
            expected[i] = i;
            source[i] = SIZE - 1 - i;
        }
    }

    @Test
    public void givenArrayWhenSortedThenTheSameLength(){
        int[] actual = heapSort.sort(source);
        Assert.assertEquals(expected.length, actual.length);
    }

    @Test
    public void givenArrayWhenSortedThenResultSorted(){
        int[] actual =  heapSort.sort(source);
        Assert.assertArrayEquals(expected, actual);
    }

}
