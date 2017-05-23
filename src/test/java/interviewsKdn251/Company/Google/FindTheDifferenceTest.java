package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 25.04.2017.
 */
public class FindTheDifferenceTest {
    @Test
    public void findDifferenceTest() throws Exception {
        Assert.assertEquals('e', FindTheDifference.findDifference("abcde", "abcd"));
    }

}