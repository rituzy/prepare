package interviewsKdn251.Company.Facebook;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22.04.2017.
 */
public class RemoveInvalidParenthesesTest {
    @Test
    public void removeInvalidParenthesesTest() throws Exception {
        System.out.println(RemoveInvalidParentheses.removeInvalidParentheses("()())()"));
        System.out.println(RemoveInvalidParentheses.removeInvalidParentheses("(a)(b)bb))()"));
        System.out.println(RemoveInvalidParentheses.removeInvalidParentheses(")("));
    }

}