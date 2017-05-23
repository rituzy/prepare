package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 19.04.2017.
 */
public class HammingDistanceSpec {
    @Test
    public void getDiffBetweenIntsTest() throws Exception {
        Assert.assertEquals(2, HammingDistance.getDiffBetweenInts(1, 4));
    }

}