package interviewsKdn251.Company.LinkedIn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 20.05.2017.
 */
public class SearchInRotatedSortedArrayTest {
    @Test
    public void findTest() throws Exception {
        int[] src = {4 ,5, 6, 7, 0, 1, 2};
        Assert.assertEquals(4, SearchInRotatedSortedArray.find(src,0));
        Assert.assertEquals(-1, SearchInRotatedSortedArray.find(src,9));
    }

}