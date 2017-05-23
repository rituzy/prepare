package interviewsKdn251.Company.twitter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 21.05.2017.
 */
public class MultiplyStringsTest {
    @Test
    public void multiplyTest() throws Exception {
        Assert.assertEquals("188034",MultiplyStrings.multiply("242", "777"));
    }

}