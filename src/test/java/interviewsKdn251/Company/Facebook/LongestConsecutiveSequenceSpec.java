package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 20.04.2017.
 */
public class LongestConsecutiveSequenceSpec {
    @Test
    public void getLenConsecutiveTest() throws Exception {
        int[] src = {100, 4, 200, 1, 3, 2};

        Assert.assertEquals(4, LongestConsecutiveSequence.getLenConsecutive(src));
    }

}