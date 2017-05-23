package interviewsKdn251.Company.Google;

/**
 * Created by user on 23.04.2017.
 */
// Given a 2D grid, each cell is either a wall 'W', an enemy 'E' or empty '0' (the number zero),
// return the maximum enemies you can kill using one bomb.
// The bomb kills all the enemies in the same row and column from the planted point until it hits
// the wall since the wall is too strong to be destroyed.
// Note that you can only put the bomb at an empty cell.

// Example:
// For the given grid

// 0 E 0 0
// E 0 W E
// 0 E 0 0

// return 3. (Placing a bomb at (1,1) kills 3 enemies)
public class BombEnemy {

    public static int getMaxEnemiesToDestroy(char[][] board){

        if (board == null || board.length == 0 || board[0].length == 0){
            return 0;
        }

        int   toReturn = 0;
        int   row = 0;
        int[] col = new int[board[0].length];

        for (int i = 0 ; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (board[i][j] == 'W') continue;

                if (j == 0 || board[i][j-1] == 'W'){

                    row = enemiesInRow(board, i, j);
                }

                if (i == 0 || board[i - 1][j] == 'W'){
                    col[j] = enemiesInCol(board, i, j);
                }

                if (board[i][j] == '0'){
                    toReturn = Math.max(row + col[j], toReturn);
                }

            }
        }

        return toReturn;
    }

    private static int enemiesInRow(char[][] board, int i, int j) {
        int counter = 0;

        while (j < board[0].length && board[i][j] != 'W'){
            if (board[i][j] == 'E') counter++;
            j++;
        }

        return counter;
    }

    private static int enemiesInCol(char[][] board, int i, int j) {
        int counter = 0;

        while (i < board.length && board[i][j] != 'W'){
            if (board[i][j] == 'E') counter++;
            i++;
        }

        return counter;
    }


}
