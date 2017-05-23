package interviewsKdn251.Company.LinkedIn;

/**
 * Created by user on 20.05.2017.
 */
// Given two sparse matrices A and B, return the result of AB.

// You may assume that A's column number is equal to B's row number.

// Example:

// A = [
//   [ 1, 0, 0],
//   [-1, 0, 3]
// ]

// B = [
//   [ 7, 0, 0 ],
//   [ 0, 0, 0 ],
//   [ 0, 0, 1 ]
// ]


//      |  1 0 0 |   | 7 0 0 |   |  7 0 0 |
// AB = | -1 0 3 | x | 0 0 0 | = | -7 0 3 |
//                   | 0 0 1 |
public class SparseMatrixMultiplication {
    public static int[][] sparse(int[][] A, int[][] B){
        int m = A.length;
        int k = A[0].length;
        int n = B[0].length;

        int[][] C = new int[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < k ; j++){
                for (int x = 0; x < n ; x++){
                    C[i][x] += A[i][j] * B[j][x];
                }
            }
        }

        return C;
    }
}
