package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22.04.2017.
 */
public class Roman2IntegerTest {
    @Test
    public void convert() throws Exception {
        Assert.assertEquals(12, Roman2Integer.convert("XII"));
    }

}