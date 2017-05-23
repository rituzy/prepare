package interviewsKdn251.Company.Uber;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 21.05.2017.
 */
public class GroupAnagramsTest {
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