package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by user on 14.05.2017.
 */
public class UniqueWordAbbreviationTest {
    @Test
    public void isUniqueTest() throws Exception {
        UniqueWordAbbreviation uniqueWordAbbreviation = new UniqueWordAbbreviation(
                Arrays.asList("deer", "door", "cake", "card")
        );

        Assert.assertFalse(uniqueWordAbbreviation.isUnique("dear"));
        Assert.assertTrue(uniqueWordAbbreviation.isUnique("cart"));
        Assert.assertFalse(uniqueWordAbbreviation.isUnique("cane"));
        Assert.assertTrue(uniqueWordAbbreviation.isUnique("make"));
    }

}