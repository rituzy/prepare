package interviewsKdn251.Company.Google;

import interviewsKdn251.Company.Airbnb.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 14.05.2017.
 */
public class ValidParenthesesTest {
    @Test
    public void isValidTest() throws Exception {
        String wrong = "{}()[(])";
        String correct = "{}()[]()[]{}()()[][]{}";

        Assert.assertFalse(ValidParentheses.isValid(wrong));
        Assert.assertTrue(ValidParentheses.isValid(correct));
    }

}