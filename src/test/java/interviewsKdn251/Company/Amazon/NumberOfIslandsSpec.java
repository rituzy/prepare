package interviewsKdn251.Company.Amazon;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 16.04.2017.
 */
public class NumberOfIslandsSpec {
    @Test
    public void getNumIslandsTest() throws Exception {
        char[][] grid ={
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'},
                {'0','0','0','1','1'},
                {'0','0','0','0','0'},
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'},
        };

        Assert.assertEquals(4, NumberOfIslands.getNumIslands(grid));
    }

}