package interviewsKdn251.Company.Amazon;

/**
 * Created by user on 16.04.2017.
 */
// Given n non-negative integers representing an elevation map where the width
// of each bar is 1, compute how much water it is able to trap after raining.

// For example,
// Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
public class TrappingRainWater {
    public static int trapMaxWater(int[] numbers){
        int left = 0;
        int right = numbers.length - 1;

        int toReturn = 0;
        int maxLeft = 0, maxRight = 0;

        while(left <= right){

            maxLeft = Math.max(maxLeft, numbers[left]);
            maxRight = Math.max(maxRight, numbers[right]);

            if (maxLeft < maxRight){
                toReturn += maxLeft - numbers[left];
                left++;
            }else{
                toReturn += maxRight - numbers[right];
                right--;
            }


        }

        return toReturn;
    }
}
