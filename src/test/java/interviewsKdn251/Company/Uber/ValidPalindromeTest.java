package interviewsKdn251.Company.Uber;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 24.05.2017.
 */
public class ValidPalindromeTest {
    @Test
    public void isValidPalindromeTest() throws Exception {
        Assert.assertTrue(ValidPalindrome.isValidPalindrome("abrarba"));
        Assert.assertTrue(ValidPalindrome.isValidPalindrome("kaak"));
        Assert.assertFalse(ValidPalindrome.isValidPalindrome("abracadabra"));
    }

}