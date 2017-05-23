package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 08.05.2017.
 */
public class MaximumProductOfWordLengthsTest {
    @Test
    public void maxProductWordsTest() throws Exception {
        String[] s16 = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        String[] s4 = {"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
        String[] s0 = {"a", "aa", "aaa", "aaaa"};
        Assert.assertEquals(16, MaximumProductOfWordLengths
                .maxProductWords(s16) );

        Assert.assertEquals(4, MaximumProductOfWordLengths
                .maxProductWords(s4) );

        Assert.assertEquals(0, MaximumProductOfWordLengths
                .maxProductWords(s0) );

    }

}