package sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sort.ShellSort;

/**
 * Created by user on 07.04.2017.
 */
public class ShellSortSpec {
    private static final int SIZE = 10;

    private int[] source = new int[SIZE];
    private int[] expected = new int[SIZE];
    private static ShellSort shellSort;


    @BeforeClass
    public static void initTestClass(){
        shellSort = new ShellSort();
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
        int[] actual = shellSort.sort(source);
        Assert.assertEquals(expected.length, actual.length);
    }
    @Test
    public void givenArrayWhenSortedThenResultSorted(){
        int[] actual =  shellSort.sort(source);
        Assert.assertArrayEquals(expected, actual);
    }

}
