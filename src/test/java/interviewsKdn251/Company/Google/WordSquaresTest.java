package interviewsKdn251.Company.Google;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 15.05.2017.
 */
public class WordSquaresTest {

    @Test
    public void getSquaresTest() throws Exception {
        List<List<String>> res = WordSquares.getSquares(new String[]{"ball","area","lead","lady"});

        System.out.println(res);
    }

}