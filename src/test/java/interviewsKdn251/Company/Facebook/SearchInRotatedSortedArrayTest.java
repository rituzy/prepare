package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22.04.2017.
 */
public class SearchInRotatedSortedArrayTest {
    @Test
    public void searchTest() throws Exception {
        int[] src = {4 ,5, 6, 7, 0, 1, 2};
        Assert.assertEquals(4, SearchInRotatedSortedArray.search(src,0));
        Assert.assertEquals(-1, SearchInRotatedSortedArray.search(src,9));
    }

}