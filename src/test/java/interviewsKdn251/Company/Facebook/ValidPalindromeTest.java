package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 23.04.2017.
 */
public class ValidPalindromeTest {
    @Test
    public void isPalindromeTest() throws Exception {
        Assert.assertTrue(ValidPalindrome.isPalindrome("abrarba"));
        Assert.assertFalse(ValidPalindrome.isPalindrome("abracadabra"));

    }

}