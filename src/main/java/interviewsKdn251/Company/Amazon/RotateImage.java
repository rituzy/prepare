package interviewsKdn251.Company.Amazon;

/**
 * Created by user on 16.04.2017.
 */
// You are given an n x n 2D matrix representing an image.

// Rotate the image by 90 degrees (clockwise).

// Follow up:
// Could you do this in-place?
public class RotateImage {

    public static void rotate(int[][] matrix){

        if (matrix == null){
            throw new IllegalArgumentException("matrix is null");
        }

        printMatrix(matrix);

        // diagonal swap
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0 ; j < i; j++){
                swap(matrix, i, j, j, i);
            }
        }

        printMatrix(matrix);

        // horizontal swap
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0 ; j < matrix.length/2; j++){
                swap(matrix, i, j, i , matrix.length - 1 - j);
            }
        }

        printMatrix(matrix);

        return;
    }

    private static void swap(int[][] matrix, int i, int j, int k, int l){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[k][l];
        matrix[k][l] = temp;
    }

    public static void printMatrix(int[][] matrix){
        System.out.println("....................");
        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }

}
