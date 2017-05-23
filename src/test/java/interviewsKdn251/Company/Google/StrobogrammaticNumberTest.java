package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 14.05.2017.
 */
public class StrobogrammaticNumberTest {
    @Test
    public void isStrobogrammaticTest() throws Exception {
        Assert.assertFalse(StrobogrammaticNumber.isStrobogrammatic("691"));
        Assert.assertTrue(StrobogrammaticNumber.isStrobogrammatic("88"));
        Assert.assertTrue(StrobogrammaticNumber.isStrobogrammatic("818"));
        Assert.assertTrue(StrobogrammaticNumber.isStrobogrammatic("69"));
        Assert.assertTrue(StrobogrammaticNumber.isStrobogrammatic("11"));
    }

}