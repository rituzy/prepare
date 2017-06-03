import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 09.04.2017.
 */
public class BackPackSpec {
    int[] weights;
    int[] values;
    int weightCapacity;

    @Before
    public void prepare(){
        weights = new int[]{1,15,16,89,54,74,66,144,22,30};
        values = new int[]{60,70,80,90,100,500,700,600,144,100};
        weightCapacity = 299;
    }

    @Test
    public void testRecursiveSolution(){
        Assert.assertEquals(1870, BackPack.getMaxValRecursive(weights, values, weightCapacity));
    }

    @Test
    public void testDPSolution(){
        Assert.assertEquals(1870, BackPack.getMaxValDP(weights, values, weightCapacity));
    }
}
