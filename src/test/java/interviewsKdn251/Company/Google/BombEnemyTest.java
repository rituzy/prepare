package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 23.04.2017.
 */
public class BombEnemyTest {

    @Test
    public void countEnemiesTest(){
        char[][] board = {
                {'0', 'E', '0', '0'},
                {'E', '0', 'W', 'E'},
                {'0', 'E', '0', '0'},
        };

        Assert.assertEquals(3, BombEnemy.getMaxEnemiesToDestroy(board));
    }


}