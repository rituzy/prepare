package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by user on 10.05.2017.
 */
public class PowTest {
    @Test
    public void powTest() throws Exception {
        Assert.assertEquals(121, Pow.pow(11,2));
        Assert.assertEquals(4782969, Pow.pow(9,7));
    }

}