package interviewsKdn251.Company.Uber;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22.05.2017.
 */
public class RegularExpressionMatchingTest {
    @Test
    public void isMatchTest() throws Exception {
        Assert.assertFalse(RegularExpressionMatching.isMatch("abracadabra", "sd") );
        Assert.assertTrue(RegularExpressionMatching.isMatch("abracadabra" , ".*acad.*") );
        Assert.assertFalse(RegularExpressionMatching.isMatch("abracadabra" , ".*arad.*") );
    }

}