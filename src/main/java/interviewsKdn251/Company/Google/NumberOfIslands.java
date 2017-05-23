package interviewsKdn251.Company.Google;

/**
 * Created by user on 08.05.2017.
 */
public class NumberOfIslands {
    public static int getIslandsCount(int[][] board){
        int toReturn = 0;

        for (int i = 0; i < board.length; i++){
            for (int j = 0 ; j < board[0].length; j++ ){
                toReturn += sink(board, i, j);
            }
        }

        return toReturn;
    }

    private static int sink(int[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == 0){
            return 0;
        }

        board[i][j] = 0;

        sink(board, i, j + 1);
        sink(board, i, j - 1);
        sink(board, i + 1, j);
        sink(board, i - 1, j);

        return 1;
    }


}
