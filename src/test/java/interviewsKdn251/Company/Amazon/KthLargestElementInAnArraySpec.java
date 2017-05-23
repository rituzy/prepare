package interviewsKdn251.Company.Amazon;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 16.04.2017.
 */
public class KthLargestElementInAnArraySpec {
    @Test
    public void getKthLargestElement() throws Exception {
        int[] src = {3,2,1,5,6,4};
        Assert.assertEquals(5, KthLargestElementInAnArray.getKthLargestElement(src, 2));
    }

}