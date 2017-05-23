package interviewsKdn251.Company.LinkedIn;

/**
 * Created by user on 17.05.2017.
 */
// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
// the only constraint stopping you from robbing each of them is that adjacent houses have security system connected
// and it will automatically contact the police if two adjacent houses were broken into on the same night.

// Given a list of non-negative integers representing the amount of money of each house, determine the maximum
// amount of money you can rob tonight without alerting the police.

public class HouseRobber {
    public static int robMax(int[] money){

        int len = money.length;

        if (len == 0 ) return 0;
        if (len == 1) return money[0];

        int[] dp = new int[len];
        dp[0] = money[0];
        dp[1] = money[0] > money[1] ? money[0] : money[1];

        for (int i = 2 ; i < len ; i++){
            dp[i] = Math.max(dp[i - 2] + money[i], dp[i - 1]);
        }

        for (int i = 0 ; i < len; i++){
            System.out.println("i= " + i + " : " + dp[i]);
        }


        return dp[len-1];
    }
}
