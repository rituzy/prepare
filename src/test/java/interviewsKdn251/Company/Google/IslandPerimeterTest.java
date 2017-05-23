package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 08.05.2017.
 */
public class IslandPerimeterTest {
    @Test
    public void countPerimeter() throws Exception {

        int grid[][] = {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0},
        };

        Assert.assertEquals(16, IslandPerimeter.countPerimeter(grid));
    }

}