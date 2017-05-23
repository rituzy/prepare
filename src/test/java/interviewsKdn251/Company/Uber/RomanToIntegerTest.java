package interviewsKdn251.Company.Uber;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22.05.2017.
 */
public class RomanToIntegerTest {
    @Test
    public void convert2intTest() throws Exception {

        //Assert.assertEquals(28, RomanToInteger.convert2int("XXVIII"));
        //Assert.assertEquals(12, RomanToInteger.convert2int("XII"));
        Assert.assertEquals(9, RomanToInteger.convert2int("IX"));

    }

}