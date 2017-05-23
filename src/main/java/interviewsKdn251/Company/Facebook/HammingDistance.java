package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 19.04.2017.
 */
// The Hamming distance between two integers is the number of positions at which the corresponding
// bits are different.

// Given two integers x and y, calculate the Hamming distance.

// Note:
// 0 ≤ x, y < 2^31.

// Example:

// Input: x = 1, y = 4

// Output: 2

// Explanation:
// 1   (0 0 0 1)
// 4   (0 1 0 0)
//        ↑   ↑

// The above arrows point to positions where the corresponding bits are different.

public class HammingDistance {
    public static int getDiffBetweenInts(int a, int b){
        return  Integer.bitCount(a^b);
    }
}
