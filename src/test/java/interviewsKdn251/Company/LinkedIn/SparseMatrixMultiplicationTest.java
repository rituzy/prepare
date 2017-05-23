package interviewsKdn251.Company.LinkedIn;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by user on 20.05.2017.
 */
public class SparseMatrixMultiplicationTest {
    @Test
    public void sparseTest() throws Exception {
        int[][] srcA = {
                {2 , 1},
                {-3, 0},
                {4, -1},
        };

        int[][] srcB = {
                {5, -1, 6},
                {-3, 0 , 7},
        };
        System.out.println("---A---");
        Arrays.stream(srcA).forEach((int[] arr) -> {
            System.out.println();
            Arrays.stream(arr).forEach(i -> System.out.print(String.valueOf(i) + " ") );
        });
        System.out.println("\n---B---");
        Arrays.stream(srcB).forEach((int[] arr) -> {
            System.out.println();
            Arrays.stream(arr).forEach(i -> System.out.print(String.valueOf(i) + " ") );
        });

        int[][] sparsed = SparseMatrixMultiplication.sparse(srcA, srcB);
        System.out.println("\n---Sparsed---");
        Arrays.stream(sparsed).forEach((int[] arr) -> {
            System.out.println();
            Arrays.stream(arr).forEach(i -> System.out.print(String.valueOf(i) + " ") );
        });
    }

}