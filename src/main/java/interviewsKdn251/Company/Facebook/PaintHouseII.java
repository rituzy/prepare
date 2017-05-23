package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 22.04.2017.
 */
// There are a row of n houses, each house can be painted with one of the k colors. The cost of
// painting each house with a certain color is different. You have to paint all the houses such that
// no two adjacent houses have the same color.

// The cost of painting each house with a certain color is represented by a n x k cost matrix.
// For example, costs[0][0] is the cost of painting house 0 with color 0; costs[1][2] is the cost
// of painting house 1 with color 2, and so on... Find the minimum cost to paint all houses.

// Note:
// All costs are positive integers.

// Follow up:
// Could you solve it in O(nk) runtime?
/*
Understand the problem:
This is a classic back pack problem.
 -- Define dp[n][k], where dp[i][j] means for house i with color j the minimum cost.
 -- Initial value: dp[0][j] = costs[0][j]. For others, dp[i][j] = Integer.MAX_VALUE;, i >= 1
 -- Transit function: dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + cost[i][j]), where k != j.
 -- Final state: Min(dp[n - 1][k]).

 O (nk)
Let us assume, we have "min_1" and "min_2".
min_1 : the lowest cost at previous stage.
min_2 : the 2nd lowest cost at previous stage.

And we have the minimum costs for all colors at previous stage.
color[i-1][k]

Then, iff we decide to paint house "i" with color "j", we can compute the minimum cost of other
colors at "i-1" stage through following way.
case 1: iff "color[i-1][j] == min_1", it means the min_1 actually records the minimum value of color[i-1][j] (previous color is j), we have to use min_2;
case 2: iff "color[i-1][j] != min_1", it means min_1 is not the value of color[i-1][j] (previous color is not j), we can use the min_1's color.
Note: iff "pre_min_1 == pre_min_2", it means there are two minimum costs, anyway, no matter which color is pre_min_1, we can use pre_min_2.
 */
public class PaintHouseII {

    public static int getMinPriceForPainting(int[][] prices){
        if (prices == null || prices.length == 0 ){
            throw new IllegalArgumentException("prices is null or empty");
        }

        int len = prices.length;
        int k = prices[0].length;

        int min_1 = 0, min_2 = 0;
        int pre_min_1, pre_min_2;

        int[] cumCosts = new int[k];

        for (int i = 0; i < len; i++){
            pre_min_1 = min_1;
            pre_min_2 = min_2;

            min_1 = Integer.MAX_VALUE;
            min_2 = Integer.MAX_VALUE;

            for (int j = 0; j < k ; j++){
                if (cumCosts[j] != pre_min_1 || pre_min_1 == pre_min_2){
                    cumCosts[j] = prices[i][j] + pre_min_1;
                }else{
                    cumCosts[j] = prices[i][j] + pre_min_2;
                }

                if (cumCosts[j] < min_1){
                    min_2 = min_1;
                    min_1 = cumCosts[j];
                }else{
                    if (cumCosts[j] < min_2){
                        min_2 = cumCosts[j];
                    }
                }
            }
        }

        return min_1;
    }

    public static int getMinPriceForPaintingClassic(int[][] prices){
        if (prices == null || prices.length == 0 ){
            throw new IllegalArgumentException("prices is null or empty");
        }

        int len = prices.length;
        int k = prices[0].length;
        int[][] cumCosts = new int[len][k];

        // initialization
        for (int i = 0; i < len; i++){
            cumCosts[0][i] = prices[0][i];
        }


        for (int i = 1; i < len; i++){
            for (int j = 0; j < k ; j++){
                cumCosts[i][j] = Integer.MAX_VALUE;
                //finding minimum in sums of current price for i-th house and j-th
                // color with prices from level i - 1
                for (int t = 0 ; t < k; t++){
                    if (t!=j){
                        cumCosts[i][j] = Math.min(cumCosts[i-1][t] + prices[i][j], cumCosts[i][j]);
                    }
                }
            }
        }

        // finding minimum value from last level len - 1
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++){
            result = Math.min(cumCosts[len-1][i], result);
        }

        return result;


    }


}
