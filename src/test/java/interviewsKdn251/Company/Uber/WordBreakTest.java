package interviewsKdn251.Company.Uber;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by user on 24.05.2017.
 */
public class WordBreakTest {
    @Test
    public void isFitTest() throws Exception {
        String strTrue = "carbarkdogfrog";
        String strFalse = "carbardogfrog";
        Set<String> dict = new HashSet<String>( Arrays.asList("car", "bark", "dog", "frog") );

        Assert.assertTrue(WordBreak.isFit(strTrue, dict));
        Assert.assertFalse(WordBreak.isFit(strFalse, dict));

    }

}