package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 11.05.2017.
 */
public class SentenceScreenFittingTest {
    @Test
    public void fitToScreenTest() throws Exception {
        Assert.assertEquals(1, SentenceScreenFitting.fitToScreen(2,8, new String[]{"hello", "world"}) );
        Assert.assertEquals(1, SentenceScreenFitting.fitToScreen(4,5, new String[]{"I", "had", "apple", "pie"}) );
        Assert.assertEquals(2, SentenceScreenFitting.fitToScreen(3,6, new String[]{"a", "bcd", "e"}) );
    }

}