package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 11.05.2017.
 */
public class ReverseVowelsOfAStringTest {
    @Test
    public void reverseVowelsTest() throws Exception {
        Assert.assertEquals("holle", ReverseVowelsOfAString.reverseVowels("hello"));

    }

}