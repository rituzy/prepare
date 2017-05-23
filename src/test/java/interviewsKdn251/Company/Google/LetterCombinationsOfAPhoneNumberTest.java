package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 08.05.2017.
 */
public class LetterCombinationsOfAPhoneNumberTest {
    @Test
    public void combinate() throws Exception {
        List<String> lst = LetterCombinationsOfAPhoneNumber.combinate("23");
//        System.out.println(lst);

        Assert.assertEquals("ad", lst.get(0));
        Assert.assertEquals("ae", lst.get(1));
        Assert.assertEquals("af", lst.get(2));
        Assert.assertEquals("bd", lst.get(3));
        Assert.assertEquals("be", lst.get(4));
        Assert.assertEquals("bf", lst.get(5));
        Assert.assertEquals("cd", lst.get(6));
        Assert.assertEquals("ce", lst.get(7));
        Assert.assertEquals("cf", lst.get(8));

    }

}