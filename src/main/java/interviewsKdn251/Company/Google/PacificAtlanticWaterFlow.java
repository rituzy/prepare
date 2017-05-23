package interviewsKdn251.Company.Google;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 08.05.2017.
 */
// Given an m x n matrix of non-negative integers representing the height of each unit cell in a continent,
// the "Pacific ocean" touches the left and top edges of the matrix and the "Atlantic ocean"
// touches the right and bottom edges.

// Water can only flow in four directions (up, down, left, or right) from a cell to another one with height equal or lower.

// Find the list of grid coordinates where water can flow to both the Pacific and Atlantic ocean.

// Note:
// The order of returned grid coordinates does not matter.
// Both m and n are less than 150.

// Example:

// Given the following 5x5 matrix:

//   Pacific ~   ~   ~   ~   ~
//        ~  1   2   2   3  (5) *
//        ~  3   2   3  (4) (4) *
//        ~  2   4  (5)  3   1  *
//        ~ (6) (7)  1   4   5  *
//        ~ (5)  1   1   2   4  *
//           *   *   *   *   * Atlantic

// Return:

// [[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (positions with parentheses in above matrix).
public class PacificAtlanticWaterFlow {
    public static List<int[]> findShortPath(int[][] board){
        List<int[]> toReturn = new ArrayList<>();

        int m = board.length;
        int n = board[0].length;

        boolean[][] pacificVisited = new boolean[m][n];
        boolean[][] atlanticVisited = new boolean[m][n];

        for (int i = 0; i < m ; i++){
            dfs(board, pacificVisited, Integer.MIN_VALUE, i, 0);
            dfs(board, atlanticVisited, Integer.MIN_VALUE, i, n - 1);
        }

        for (int j = 0; j < n ; j++){
            dfs(board, pacificVisited, Integer.MIN_VALUE, 0, j);
            dfs(board, atlanticVisited, Integer.MIN_VALUE, m - 1, j);
        }

        for (int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                if (pacificVisited[i][j] && atlanticVisited[i][j]){
                    toReturn.add(new int[]{i, j} );
                }
            }
        }

        return toReturn;
    }

    private static void dfs(int[][] board, boolean[][] visited, int height, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] < height
                || visited[i][j]){
            return;
        }

        visited[i][j] = true;

        dfs(board, visited, board[i][j], i, j + 1);
        dfs(board, visited, board[i][j], i, j - 1);
        dfs(board, visited, board[i][j], i + 1, j);
        dfs(board, visited, board[i][j], i - 1, j);

    }


}
