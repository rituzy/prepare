package interviewsKdn251.Company.Amazon;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 16.04.2017.
 */
public class GroupAnagramsSpec {
    @Test
    public void groupAnagramsTest() throws Exception {
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> actual = GroupAnagrams.groupAnagrams(strings);

        for (List<String> lst : actual) {
            System.out.println(lst);
        }
        //Assert.assertEquals();

    }

}