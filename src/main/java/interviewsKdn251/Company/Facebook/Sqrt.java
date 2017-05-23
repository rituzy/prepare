package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 22.04.2017.
 */
// Implement int sqrt(int x).

// Compute and return the square root of x.
public class Sqrt {
    public static int getSqrt(int num){

        int left = 0, right = num;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if (num / mid == mid){
                return mid;
            }

            if (num / mid > mid){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return right;
    }
}
