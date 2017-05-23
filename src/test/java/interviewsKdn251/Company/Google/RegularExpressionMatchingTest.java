package interviewsKdn251.Company.Google;

import interviewsKdn251.Company.Airbnb.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 10.05.2017.
 */
public class RegularExpressionMatchingTest {
    @Test
    public void regexTest() throws Exception {
        Assert.assertFalse(RegularExpressionMatching.regex("sd" , "abracadabra") );
        Assert.assertTrue(RegularExpressionMatching.regex(".*acad.*", "abracadabra" ) );
        Assert.assertFalse(RegularExpressionMatching.regex(".*arad.*", "abracadabra" ) );
    }

}