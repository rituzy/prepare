package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 19.04.2017.
 */
public class IntegerToEnglishWordSpec {
    @Test
    public void intToString() throws Exception {
        Assert.assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven",
                IntegerToEnglishWord.intToString(1234567 ));
    }

}