package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.*;

/**
 * Created by user on 23.04.2017.
 */
public class WordBreakTest {
    @Test
    public void isSgemented() throws Exception {
        Assert.assertTrue(WordBreak.isSgemented("leetcode", new HashSet<>(Arrays.asList("leet", "code"))));
    }

}