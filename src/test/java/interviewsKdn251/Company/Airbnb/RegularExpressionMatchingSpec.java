package interviewsKdn251.Company.Airbnb;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 15.04.2017.
 */
public class RegularExpressionMatchingSpec {
    @Test
    public void isMatch() throws Exception {
        Assert.assertFalse(RegularExpressionMatching.isMatch("abracadabra", "sd") );
        Assert.assertTrue(RegularExpressionMatching.isMatch("abracadabra", ".*acad.*") );
        Assert.assertFalse(RegularExpressionMatching.isMatch("abracadabra", ".*arad.*") );

    }

}