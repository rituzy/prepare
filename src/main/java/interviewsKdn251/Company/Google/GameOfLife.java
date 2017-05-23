package interviewsKdn251.Company.Google;

/**
 * Created by user on 06.05.2017.
 */
// According to the Wikipedia's article: "The Game of Life, also known simply as Life,
// is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

// Given a board with m by n cells, each cell has an initial state live (1) or dead (0).
// Each cell interacts with its eight neighbors (horizontal, vertical, diagonal)
// using the following four rules (taken from the above Wikipedia article):

// Any live cell with fewer than two live neighbors dies, as if caused by under-population.
// Any live cell with two or three live neighbors lives on to the next generation.
// Any live cell with more than three live neighbors dies, as if by over-population..
// Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
// Write a function to compute the next state (after one update) of the board given its current state.

// Follow up:
// Could you solve it in-place? Remember that the board needs to be updated at the same time:
// You cannot update some cells first and then use their updated values to update other cells.
// In this question, we represent the board using a 2D array. In principle, the board is infinite,
// which would cause problems when the active area encroaches the border of the array.
// How would you address these problems?

public class GameOfLife {

    public static void makeTurn(int[][] board) {
        if (board == null || board.length == 0) return;

        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // get all live neighbors count
                int lives = getLiveNeighbors(i, j, m, n, board);
                // if there are 2 to 3 live neighbours around live cell than it remains live. Mark it 0<1>1
                if (board[i][j] == 1 && lives >= 2 && lives <= 3) {
                    board[i][j] = 3;
                }
                // if there are 3 live neighbours around dead cell than it becomes live. Mark it 0<1>0
                if (board[i][j] == 0 && lives == 3) {
                    board[i][j] = 2;
                }
                // all other cases mean the cell goes to become/remain dead: 0<0>1 or 0<0>0
            }
        }
        // return 0/1 values in the board: move to right by 1 bit
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] >>= 1;
            }
        }

    }

    private static int getLiveNeighbors(int i, int j, int m, int n, int[][] board){

        int toRetrun = 0;

        for (int x = Math.max(0, i - 1); x <= Math.min(m-1, i + 1 ); x++){
            for (int y = Math.max(0, j - 1); y <= Math.min(n-1, j + 1) ; y++){
                toRetrun += board[x][y] & 1;
            }
        }

        toRetrun -= board[i][j] & 1;

        return toRetrun;
    }
}
