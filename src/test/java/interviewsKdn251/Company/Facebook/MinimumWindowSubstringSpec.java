package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 21.04.2017.
 */
public class MinimumWindowSubstringSpec {
    @Test
    public void findMinWindowTest() throws Exception {
        String src = "ADOBECODEBANCTRW";
        String src1 = "AEBRCA";
        String toFind  = "ABC";

        Assert.assertEquals("BANC", MinimumWindowSubstring.findMinWindow(src1,toFind));
    }

}