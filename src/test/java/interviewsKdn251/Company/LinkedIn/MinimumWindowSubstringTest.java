package interviewsKdn251.Company.LinkedIn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 20.05.2017.
 */
public class MinimumWindowSubstringTest {
    @Test
    public void getMinWindowTest() throws Exception {
        String src = "ADOBECODEBANCTRW";
        String src1 = "AEBRCA";
        String toFind  = "ABC";

        Assert.assertEquals("BANC", MinimumWindowSubstring.getMinWindow(src,toFind));
        Assert.assertEquals("BRCA", MinimumWindowSubstring.getMinWindow(src1,toFind));
    }

}