package interviewsKdn251.Company.Google;

/**
 * Created by user on 14.05.2017.
 */
// Given n non-negative integers representing an elevation map where the width of each bar is 1,
// compute how much water it is able to trap after raining.

// For example,
// Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.

public class TrappingRainWater {
    public static int trap(int[] numbers){
        int toRetrun = 0;

        int left = 0, right = numbers.length - 1;
        int leftMax = 0, rightMax = 0;

        while(left < right){

            leftMax = Math.max(leftMax, numbers[left]);
            rightMax = Math.max(rightMax, numbers[right]);

            if (leftMax < rightMax){
                toRetrun += leftMax - numbers[left];
                left++;
            }else {
                toRetrun += rightMax - numbers[right];
                right--;
            }
        }
        return toRetrun;
    }
}
