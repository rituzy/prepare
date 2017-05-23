package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 18.04.2017.
 */
public class DecodeWaysSpec {
    @Test
    public void getCombinationsDecodedTest() throws Exception {
        Assert.assertEquals(2, DecodeWays.getCombinationsDecoded("12") );
        Assert.assertEquals(589824, DecodeWays.getCombinationsDecoded("4757562545844617494555774581341211511296816786586787755257741178599337186486723247528324612117156948") );
    }

}