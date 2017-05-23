package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 23.04.2017.
 */
public class WordSearchTest {
    @Test
    public void isWordContains() throws Exception {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'},
        };

        Assert.assertTrue(WordSearch.isWordContains(board,  "ABCCED"));
        Assert.assertTrue(WordSearch.isWordContains(board,  "SEE"));
        Assert.assertFalse(WordSearch.isWordContains(board,  "ABCB"));
    }

}