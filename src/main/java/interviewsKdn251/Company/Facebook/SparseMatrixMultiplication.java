package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 22.04.2017.
 */
public class SparseMatrixMultiplication {
    public static int[][] sparseMatrix(int[][] A, int[][] B){
        int m = A.length;
        int n = A[0].length;
        int nB = B[0].length;

        int[][] C = new int[m][nB];
        for (int i = 0 ; i < m; i++){
            for (int j = 0; j < n; j++){
                if (A[i][j] != 0){
                    for (int k = 0; k < nB; k++){
                        if (B[j][k] != 0){
                            C[i][k] += B[j][k] * A[i][j];
                        }
                    }
                }
            }
        }

        return C;
    }
}
