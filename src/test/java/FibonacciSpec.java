import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by user on 10.04.2017.
 */
public class FibonacciSpec {
    @Test
    public void getFibList() throws Exception {
        assertEquals(0, Fibonacci.getFibList(0).size());
        assertEquals(Arrays.asList(0), Fibonacci.getFibList(1));
        assertEquals(Arrays.asList(0,1), Fibonacci.getFibList(2));
        assertEquals(Arrays.asList(0,1,1), Fibonacci.getFibList(3));
        assertEquals(Arrays.asList(0,1,1,2,3,5,8,13), Fibonacci.getFibList(8));
    }

    @Test
    public void when7NumThen13 (){
        int expected = 13;
        int actual = Fibonacci.getFibNum(7);
        assertEquals(expected, actual);
    }

}