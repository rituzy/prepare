import org.junit.Assert;
import org.junit.Test;

import javax.swing.text.PlainDocument;

import static org.junit.Assert.*;

/**
 * Created by user on 14.04.2017.
 */
public class PalindromeSpec {
    @Test
    public void isPalindromTest() throws Exception {
        String notPalindrome = "notPalindrome";
        String palindrom = "Me0ga123A1gEm";

        Assert.assertTrue(Palindrome.isPalindrome(palindrom));
        Assert.assertFalse(Palindrome.isPalindrome(notPalindrome));
    }

}