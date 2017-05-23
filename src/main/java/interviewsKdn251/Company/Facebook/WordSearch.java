package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 23.04.2017.
 */
// Given a 2D board and a word, find if the word exists in the grid.

// The word can be constructed from letters of sequentially adjacent cell, where "adjacent"
// cells are those horizontally or vertically neighboring. The same letter cell may not be
// used more than once.

// For example,
// Given board =

// [
//   ['A','B','C','E'],
//   ['S','F','C','S'],
//   ['A','D','E','E']
// ]
// word = "ABCCED", -> returns true,
// word = "SEE", -> returns true,
// word = "ABCB", -> returns false.
public class WordSearch {
    public static boolean isWordContains(char[][] board, String word){

        if (board == null || board.length == 0){
            throw new IllegalArgumentException("board must be not a null or empty");
        }

        char[] wordChars = word.toCharArray();

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (dfs(board, i, j, wordChars, 0)){
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean dfs(char[][] board, int i, int j, char[] wordChars, int position){

        if (position == wordChars.length){
            return true;
        }
        // if out of bounds or the char differs get out
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length
                || board[i][j] != wordChars[position]){
            return  false;
        }
        // reset current corresponding char not to use it twice in the future
        board[i][j] ^= 256;

        // trying to find next one char recursively in the neighbours
        // if any direction returns true, than found
        boolean exists = dfs(board, i + 1, j, wordChars, position + 1)
        || dfs(board, i - 1, j, wordChars, position + 1)
        || dfs(board, i, j + 1, wordChars, position + 1)
        || dfs(board, i, j - 1, wordChars, position + 1);

        board[i][j] ^= 256;

        return exists;
    }
}
