package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22.04.2017.
 */
public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void removeDubs() throws Exception {
        int[] src = {1, 1, 2 , 4 , 5 ,5 ,6 ,7 ,8 ,9,9};

        Assert.assertEquals(8, RemoveDuplicatesFromSortedArray.removeDubs(src));
    }

}