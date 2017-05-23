package interviewsKdn251.Company.Amazon;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 16.04.2017.
 */
public class BestTimeToBuyAndSellStockSpec {
    @Test
    public void getMaxProfitTest() throws Exception {
        int[] prices5 = {7, 1, 5, 3, 6, 4};
        int[] prices0 = {7, 6, 4, 3, 1};

        Assert.assertEquals(5, BestTimeToBuyAndSellStock.getMaxProfit(prices5));
        Assert.assertEquals(0, BestTimeToBuyAndSellStock.getMaxProfit(prices0));

    }

}