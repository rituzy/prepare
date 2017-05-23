package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by user on 14.05.2017.
 */
public class SummaryRangesTest {
    @Test
    public void getSummaryRangesTest() throws Exception {
        // For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].

        Assert.assertEquals(Arrays.asList("0->2","4->5","7"),SummaryRanges.getSummaryRanges(new int[] {0,1,2,4,5,7}));

    }

}