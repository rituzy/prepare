package interviewsKdn251.Company.Airbnb;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 15.04.2017.
 */
public class ValidParenthesesSpec {
    @Test
    public void isValidStringTest() throws Exception {
        String wrong = "{}()[(])";
        String correct = "{}()[]()[]{}()()[][]{}";

        Assert.assertFalse(ValidParentheses.isValidString(wrong));
        Assert.assertTrue(ValidParentheses.isValidString(correct));
    }

}