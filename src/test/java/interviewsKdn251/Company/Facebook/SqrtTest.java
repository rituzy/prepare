package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22.04.2017.
 */
public class SqrtTest {
    @Test
    public void getSqrtTest() throws Exception {
        Assert.assertEquals(5, Sqrt.getSqrt(25));
        Assert.assertEquals(11, Sqrt.getSqrt(121));
        Assert.assertEquals(4, Sqrt.getSqrt(20));
    }

}