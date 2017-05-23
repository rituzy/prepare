package interviewsKdn251.Company.Uber;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 21.05.2017.
 */
public class BestTimeToBuyAndSellStockTest {
    @Test
    public void getProfit() throws Exception {
        int[] prices5 = {7, 1, 5, 3, 6, 4};
        int[] prices0 = {7, 6, 4, 3, 1};

        Assert.assertEquals(5, BestTimeToBuyAndSellStock.getProfit(prices5));
        Assert.assertEquals(0, BestTimeToBuyAndSellStock.getProfit(prices0));
    }

}