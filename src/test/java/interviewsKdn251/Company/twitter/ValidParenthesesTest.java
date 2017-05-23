package interviewsKdn251.Company.twitter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 21.05.2017.
 */
public class ValidParenthesesTest {
    @Test
    public void validParenthesesTest() throws Exception {
        String wrong = "{}()[(])";
        String correct = "{}()[]()[]{}()()[][]{}";

        Assert.assertFalse(ValidParentheses.validParentheses(wrong));
        Assert.assertTrue(ValidParentheses.validParentheses(correct));
    }

}