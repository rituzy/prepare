package interviewsKdn251.Company.LinkedIn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 20.05.2017.
 */
public class ProductOfArrayExceptSelfTest {
    @Test
    public void getProductTest() throws Exception {
        int[] src = {6,2,3,4,5};
        int[] expected = {120,360,240,180,144};

        Assert.assertArrayEquals(expected, ProductOfArrayExceptSelf.getProduct(src));
    }

}