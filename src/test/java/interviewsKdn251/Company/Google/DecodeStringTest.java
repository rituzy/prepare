package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 24.04.2017.
 */
public class DecodeStringTest {
    @Test
    public void decodeTest() throws Exception {
        Assert.assertEquals("eeaaa", DecodeString.decode("2[e]3[a]"));
    }

}