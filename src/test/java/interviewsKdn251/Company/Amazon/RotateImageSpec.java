package interviewsKdn251.Company.Amazon;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 16.04.2017.
 */
public class RotateImageSpec {
    @Test
    public void rotateTest() throws Exception {
        int[][] actual = {
                {1,2,3},
                {5,6,7},
                {8,9,0}
        };


        int[][] expected = {
                {8,5,1},
                {9,6,2},
                {0,7,3}
        };
        RotateImage.rotate(actual);

        Assert.assertArrayEquals(expected, actual);

    }

}