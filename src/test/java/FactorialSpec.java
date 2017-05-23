import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 10.04.2017.
 */
public class FactorialSpec {
    @Test
    public void given10WhenFactorialCycleThen3628800() throws Exception {
        long actual = Factorial.factorialCycle(10);
        final long expected = 3628800L;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void given10WhenFacturialRecursiveThen3628800() throws Exception{
        long actual = Factorial.factorialRecursive(10);
        final long expected = 3628800L;
        Assert.assertEquals(expected, actual);
    }

}