package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22.04.2017.
 */
public class PowTest {
    @Test
    public void powTest() throws Exception {
        Assert.assertEquals(121, Pow.pow(11,2));
        Assert.assertEquals(4782969, Pow.pow(9,7));
    }

}