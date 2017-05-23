package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 13.05.2017.
 */
public class ShortestDistanceFromAllBuildingsTest {
    @Test
    public void getShortDistanceTest() throws Exception {
        int[][] land = {
                {1 , 0 , 2 , 0 , 1},
                {0 , 0 , 0 , 0 , 0},
                {0 , 0 , 1 , 0 , 0},
        };

        Assert.assertEquals(7, ShortestDistanceFromAllBuildings.getShortDistance(land));
    }

}