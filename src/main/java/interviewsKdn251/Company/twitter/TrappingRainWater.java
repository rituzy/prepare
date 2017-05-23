package interviewsKdn251.Company.twitter;

/**
 * Created by user on 21.05.2017.
 */

// Given n non-negative integers representing an elevation map where the width of each bar is 1,
// compute how much water it is able to trap after raining.

// For example,
// Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.

public class TrappingRainWater {
    public static int trap(int[] numbers){
        if (numbers == null || numbers.length == 0) return 0;

        int left = 0;
        int right = numbers.length - 1;
        int maxLeft = 0;
        int maxRigth = 0;
        int water = 0;

        while (left <= right){
            maxLeft = Math.max(numbers[left], maxLeft);
            maxRigth = Math.max(numbers[right], maxRigth);

            if (maxLeft > maxRigth){
                water += maxRigth - numbers[right];
                right--;
            }else{
                water += maxLeft - numbers[left];
                left++;
            }
        }

        return water;
    }
}
