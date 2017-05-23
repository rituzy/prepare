package interviewsKdn251.Company.Google;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 06.05.2017.
 */
public class GameOfLifeTest {
    @Test
    public void makeTurnTest() throws Exception {
        int[][] board = {
                {0,1,1,0},
                {0,1,0,0},
                {0,1,1,1},
                {0,0,0,0},
                {0,1,1,1},
        };

        for (int i = 0 ; i < board.length; i++){
            for (int j = 0 ; j < board[0].length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }

        GameOfLife.makeTurn(board);

        System.out.println("------AFTER---------");

        for (int i = 0 ; i < board.length; i++){
            for (int j = 0 ; j < board[0].length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }

    }

}