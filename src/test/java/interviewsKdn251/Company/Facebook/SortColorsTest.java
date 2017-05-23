package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by user on 22.04.2017.
 */
public class SortColorsTest {
    @Test
    public void sortColorsTest() throws Exception {
        int[] src = {1, 2, 0, 2, 1, 1, 0, 0, 2, 1, 1};
        int[] expected = {0,0,0,1,1,1,1,1,2,2,2};

        Arrays.stream(src).forEach(i -> System.out.print(String.valueOf(i) + ","));
        SortColors.sortColors(src);
        System.out.println();
        Arrays.stream(src).forEach(i -> System.out.print(String.valueOf(i) + ","));

        Assert.assertArrayEquals(expected, src);
    }

}