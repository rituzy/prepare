package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 08.05.2017.
 */
public class LongestConsecutiveSequenceTest {
    @Test
    public void findLongesPartTest() throws Exception {
        int[] src = {100, 4, 200, 1, 3, 2};


        Assert.assertEquals(4, LongestConsecutiveSequence.findLongesPart(src));
    }

}