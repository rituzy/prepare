package interviewsKdn251.Company.Uber;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22.05.2017.
 */
public class MinimumWindowSubstringTest {
    @Test
    public void getWindowTest() throws Exception {
        String src = "ADOBECODEBANCTRW";
        String src1 = "AEBRCA";
        String toFind  = "ABC";

        Assert.assertEquals("BANC", MinimumWindowSubstring.getWindow(src,toFind));
        Assert.assertEquals("BRCA", MinimumWindowSubstring.getWindow(src1,toFind));
    }

}