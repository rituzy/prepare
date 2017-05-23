package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 17.04.2017.
 */
public class AddBinarySpec {
    @Test
    public void addBinaryTest() throws Exception {
        String a = "1", b = "11";

        Assert.assertEquals("100", AddBinary.addBinary(a, b));
        Assert.assertNotEquals("10", AddBinary.addBinary(a, b));
    }

}