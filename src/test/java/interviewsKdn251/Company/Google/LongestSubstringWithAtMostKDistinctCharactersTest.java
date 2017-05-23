package interviewsKdn251.Company.Google;

import interviewsKdn251.Company.Facebook.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 08.05.2017.
 */
public class LongestSubstringWithAtMostKDistinctCharactersTest {
    @Test
    public void countMaxSubsTringKDistinctCharactersTest() throws Exception {
        Assert.assertEquals(3, LongestSubstringWithAtMostKDistinctCharacters
                .countMaxSubsTringKDistinctCharacters("eceba", 2));
    }

}