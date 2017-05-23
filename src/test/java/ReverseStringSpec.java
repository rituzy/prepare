import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 13.04.2017.
 */
public class ReverseStringSpec {
    @Test
    public void whenStringThenGnirst(){
        String expected = "gnirtS";
        String actual = ReverseString.Reverse("String");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenStringThenGnirstLib(){
        String expected = "gnirtS";
        String actual = ReverseString.ReverseUsingLib("String");
        Assert.assertEquals(expected, actual);

    }

}