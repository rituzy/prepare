package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 22.04.2017.
 */
// Given an array with n objects colored red, white or blue, sort them so that objects of
// the same color are adjacent, with the colors in the order red, white and blue.

// Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

// Note:
// You are not suppose to use the library's sort function for this problem.
public class SortColors {
    public static void sortColors(int[] colors){
        int index = 0;

        // move red colors to the right first
        for (int i = 0 ; i < colors.length; i++){
            if (colors[i] == 0){
                int temp = colors[i];
                colors[i] = colors[index];
                colors[index] = temp;
                index++;
            }
        }

        // move blue colors to the right second
        for (int i = 0 ; i < colors.length; i++){
            if (colors[i] == 1){
                int temp = colors[i];
                colors[i] = colors[index];
                colors[index] = temp;
                index++;
            }
        }

    }

}
