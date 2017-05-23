package interviewsKdn251.Company.Airbnb;

/**
 * Created by user on 15.04.2017.
 */
// You are a professional robber planning to rob houses along a street. Each house has a certain
// amount of money stashed, the only constraint stopping you from robbing each of them is that
// adjacent houses have security system connected and it will automatically contact the police
// if two adjacent houses were broken into on the same night.

// Given a list of non-negative integers representing the amount of money of each house,
// determine the maximum amount of money you can rob tonight without alerting the police.

public class Robber {

    public static int gemMaxMoney(int[] arr){

        if (arr.length == 0) return 0;
        if (arr.length == 1) return arr[1];

        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = arr[0] > arr[1]? arr[0] : arr[1];

        for (int i = 2; i < arr.length; i++){
            dp[i] = Math.max(dp[i-2] + arr[i], dp[i - 1]);
        }

        for (int i = 0 ; i < dp.length; i++){
            System.out.println("Money amount for " + i + " is: " + dp[i]);
        }

        return dp[dp.length - 1];

    }

}
