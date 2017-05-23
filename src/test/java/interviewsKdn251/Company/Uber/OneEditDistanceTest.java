package interviewsKdn251.Company.Uber;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22.05.2017.
 */
public class OneEditDistanceTest {
    @Test
    public void isOneEditDistance() throws Exception {
        Assert.assertTrue(OneEditDistance.isOneEditDistance("blablabla", "1blablabla"));
        Assert.assertTrue(OneEditDistance.isOneEditDistance("blablabla", "blabl1abla"));
        Assert.assertTrue(OneEditDistance.isOneEditDistance("blablabla", "blablabla1"));
        Assert.assertFalse(OneEditDistance.isOneEditDistance("blablabla", "blabl11abla1"));
    }

}