/**
 * Created by user on 09.04.2017.
 * The knapsack problem or rucksack problem is a problem in combinatorial optimization: Given a set
 * of items, each with a weight and a value, determine the number of each item to include in a collection
 * o that the total weight is less than or equal to a given limit and the total value is as large as possible.
 * It derives its name from the problem faced by someone who is constrained by a fixed-size knapsack and must
 * fill it with the most valuable items.
 */
public class BackPack {
    public static int getMaxValRecursive(int[] weights, int[] values, int weightCapacity){
        return getMaxValRecursive(weights.length - 1, weights, values, weightCapacity);
    }

    private static int getMaxValRecursive(int i, int[] weights, int[] values, int weightCapacity){
        if (i < 0){
            return 0;
        }

        if (weights[i] > weightCapacity){
            return getMaxValRecursive(i - 1, weights, values, weightCapacity);
        }else{
            return Math.max(getMaxValRecursive(i - 1, weights, values, weightCapacity - weights[i]) + values[i],
                    getMaxValRecursive(i - 1, weights, values, weightCapacity));
        }
    }

    public static int getMaxValDP(int[] weights, int[] values, int weightCapacity){
        int n = values.length; // items in rows
        int W = weightCapacity; // weiths in columns

        int[][] dp = new int[n + 1][W + 1];
        // border case when there is no items(no things to put in the backpack)
        for (int row = 0; row <= n; row++){
            dp[row][0] = 0;
        }

        // border case when capacity is 0(backpack is damaged for example)
        for (int col = 0; col <= W; col++){
            dp[0][col] = 0;
        }

        for (int item = 1 ; item <= n; item++){
            // for every row
            for (int weight = 1; weight <= W ; weight++){
                // if item is lighter than running weight
                if (weights[item - 1] <= weight){
                    dp[item][weight] = Math.max(dp[item - 1][weight] , dp[item - 1][weight - weights[item - 1]]
                            + values[item - 1]);
                }else{
                    // skip the item
                    dp[item][weight] = dp[item - 1][weight];
                }
            }
        }

        for (int i = 0 ; i <= n ; i++){
            for (int j = 0 ; j <= W; j++){
                System.out.print(" " + dp[i][j]);
            }
            System.out.println();
        }

        return dp[n][W];
    }
}
