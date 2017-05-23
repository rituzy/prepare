package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 18.04.2017.
 */
public class CountAndSaySpec {
    @Test
    public void countAndSay() throws Exception {
        Assert.assertEquals("21", CountAndSay.countAndSay(2));
    }

}