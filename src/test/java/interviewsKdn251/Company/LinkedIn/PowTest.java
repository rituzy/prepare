package interviewsKdn251.Company.LinkedIn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 20.05.2017.
 */
public class PowTest {
    @Test
    public void powTest() throws Exception {
        Assert.assertEquals(121d, Pow.pow(11,2), 0.01);
        Assert.assertEquals(4782969d, Pow.pow(9,7), 0.01);
    }

}