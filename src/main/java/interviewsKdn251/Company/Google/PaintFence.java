package interviewsKdn251.Company.Google;

/**
 * Created by user on 09.05.2017.
 */

// There is a fence with n posts, each post can be painted with one of the k colors.

// You have to paint all the posts such that no more than two adjacent fence posts have the same color.

// Return the total number of ways you can paint the fence.

// Note:
// n and k are non-negative integers.

/***
 Understand the problem:
 We can use a DP solution.
 -- Define two DP arrays, diff[n] and same[i]. Where diff[i] means the number of ways
 for the fence i which has different color with fence i -1. same[i] means the number of ways
 if fence i has the same color with fence i - 1.
 --  Initialization same[0] = 0, diff[0] = k.
 -- same[i] = diff[i - 1].
 -- diff[i] = (k - 1) * (same[i - 1] + diff[i - 1]);

 -- Final state: same[n - 1] + diff[n - 1].
 */
public class PaintFence {

    public static int countCombinations(int n, int k){
        int preDiff = k;
        int preSame = 0;

        for (int i = 1; i < n; i++ ){

            int same = preDiff;
            int diff = (preDiff + preSame) * (k - 1);

            preDiff = diff;
            preSame = same;

        }

        return preDiff + preSame;
    }
}
