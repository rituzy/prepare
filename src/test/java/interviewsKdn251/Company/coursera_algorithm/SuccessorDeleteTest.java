package interviewsKdn251.Company.coursera_algorithm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 28.05.2017.
 */
public class SuccessorDeleteTest {
    @Test
    public void removeTest() throws Exception {
        SuccessorDelete sd = new SuccessorDelete();
        Assert.assertEquals(11, sd.remove(9));
        Assert.assertEquals(89, sd.remove(11));
        Assert.assertEquals(-1, sd.remove(-58));
    }

}