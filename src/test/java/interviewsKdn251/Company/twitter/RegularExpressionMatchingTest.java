package interviewsKdn251.Company.twitter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 21.05.2017.
 */
public class RegularExpressionMatchingTest {
    @Test
    public void isMatchTest() throws Exception {
        Assert.assertFalse(RegularExpressionMatching.isMatch("abracadabra", "sd") );
        Assert.assertTrue(RegularExpressionMatching.isMatch("abracadabra" , ".*acad.*") );
        Assert.assertFalse(RegularExpressionMatching.isMatch("abracadabra" , ".*arad.*") );
    }

}