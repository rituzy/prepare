import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 11.04.2017.
 */
public class AnagramsSpec {
    @Test
    public void givenArrayWhenDdbThenBdd() throws Exception {
        Anagrams anagrams = new Anagrams(Arrays.asList("abs", "ytg", "abc", "bdd", "cab"));
        List<String> expected = Arrays.asList("bdd");
        String strAn = "dbd";
        List<String> actual = anagrams.getAnagrams(strAn);

        Assert.assertTrue("List are equals", expected.equals(actual));

    }

}