import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 10.04.2017.
 */
public class FizzBuzzTest {
    @Test
    public void when3ThenFizz () throws Exception {
        String expected = "12Fizz";
        String actual = FizzBuzz.fizzBuzz(3);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void when5ThenFizzBazz () throws Exception {
        String expected = "12Fizz4Buzz";
        String actual = FizzBuzz.fizzBuzz(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when15ThenFizzBazzTogether () throws Exception {
        String expected = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz";
        String actual = FizzBuzz.fizzBuzz(15);
        Assert.assertEquals(expected, actual);
    }
}