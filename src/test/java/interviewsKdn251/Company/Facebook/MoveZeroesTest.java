package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22.04.2017.
 */
public class MoveZeroesTest {
    @Test
    public void moveZeroesTest() throws Exception {
        int[] src = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};

        Assert.assertArrayEquals(expected, MoveZeroes.moveZeroes(src) );
    }

}