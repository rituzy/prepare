package interviewsKdn251.Company.coursera_algorithm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 31.05.2017.
 */
public class KthElement2ArraysTest {
    @Test
    public void getMedianTest() throws Exception {
        int ar1[] = {1, 12, 15, 26, 38};
        int ar2[] = {2, 13, 17, 30, 45};

        int n1 = ar1.length;
        int n2 = ar2.length;

        int result = KthElement2Arrays.KthSmallestIn2SortedArrays(ar1, ar2, 0, n1, 0 , n2, 4);

        Assert.assertEquals(17, result);
        if (n1 == n2)
            System.out.println("Median is " + result
                    );
        else
            System.out.println("arrays are of unequal size");
    }

}