package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 08.05.2017.
 */
public class MissingRangesTest {
    @Test
    public void findMissingRangesTest() throws Exception {

        int[] src = {0, 1, 3, 50, 75};
        List<String> expected = Arrays.asList("2", "4->49", "51->74", "76->99");

        Assert.assertEquals(expected, MissingRanges.findMissingRanges(src, 0, 99));
    }

}