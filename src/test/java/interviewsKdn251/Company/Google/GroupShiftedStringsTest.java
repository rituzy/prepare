package interviewsKdn251.Company.Google;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 07.05.2017.
 */
public class GroupShiftedStringsTest {
    @Test
    public void groupWordsTest() throws Exception {
        List<String> src = Arrays.asList("abc", "bcd", "acef", "xyz", "az", "ba", "a", "z");
        System.out.println(GroupShiftedStrings.groupWords(src));
    }

}