package interviewsKdn251.Company.Facebook;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22.04.2017.
 */
public class PaintHouseIITest {
    @Test
    public void getMinPriceForPainting() throws Exception {
        int[][] costs ={
                {1 , 4 , 6 , 7},
                {2 , 4 , 10 , 21},
                {8 , 9 , 16 , 1},
                {18 , 16 , 10 , 11},
        };

        for (int i = 0; i < costs.length; i++) {
            System.out.println();
            for (int j = 0; j < costs[0].length; j++)
                System.out.print(String.valueOf(costs[i][j]) + " ");
        }
        System.out.println();
        System.out.println(PaintHouseII.getMinPriceForPainting(costs));

        System.out.println();
        System.out.println(PaintHouseII.getMinPriceForPaintingClassic(costs));
    }

}