package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by user on 14.05.2017.
 */
public class WiggleSortTest {
    @Test
    public void wSortTest() throws Exception {
        // For example, given nums = [3, 5, 2, 1, 6, 4], one possible answer is [1, 6, 2, 5, 3, 4].
        //Assert.assertArrayEquals(new int[]{1, 6, 2, 5, 3, 4}, WiggleSort.wSort(new int[]{3, 5, 2, 1, 6, 4}));

        int[] result = WiggleSort.wSort(new int[]{3, 5, 2, 1, 6, 4});
        for (int i = 0; i < result.length; i++ ){
            System.out.print(result[i]);
        }

    }

}