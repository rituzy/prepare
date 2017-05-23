package interviewsKdn251.Company.twitter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 21.05.2017.
 */
public class OneEditDistanceTest {
    @Test
    public void isOneEditDistanceTest() throws Exception {
        Assert.assertTrue(OneEditDistance.isOneEditDistance("blablabla", "1blablabla"));
        Assert.assertTrue(OneEditDistance.isOneEditDistance("blablabla", "blabl1abla"));
        Assert.assertTrue(OneEditDistance.isOneEditDistance("blablabla", "blablabla1"));
        Assert.assertFalse(OneEditDistance.isOneEditDistance("blablabla", "blabl11abla1"));
    }

}