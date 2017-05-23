package interviewsKdn251.Company.Amazon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by user on 16.04.2017.
 */
public class WordBreakSpec {
    @Test
    public void isWordBreakTest() throws Exception {
        String strTrue = "carbarkdogfrog";
        String strFalse = "carbardogfrog";
        Set<String> dict = new HashSet<String>( Arrays.asList("car", "bark", "dog", "frog") );

        Assert.assertTrue(WordBreak.isWordBreak(strTrue, dict));
        Assert.assertFalse(WordBreak.isWordBreak(strFalse, dict));
    }

}