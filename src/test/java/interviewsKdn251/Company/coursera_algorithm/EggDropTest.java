package interviewsKdn251.Company.coursera_algorithm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 28.05.2017.
 */
public class EggDropTest {
    @Test
    public void eggDropTest() throws Exception {
        int n = 2;
        int k = 100;
        System.out.println("Minimum number of trials in worst case with "+n+"  eggs and "+k+
                " floors is "+ EggDrop.eggDrop(n, k));

        Assert.assertEquals(14, EggDrop.eggDrop(n, k));
    }

}