package interviewsKdn251.Company.Amazon;

import java.util.Arrays;

/**
 * Created by user on 16.04.2017.
 */
// Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
// An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
// You may assume all four edges of the grid are all surrounded by water.

// Example 1:

// 11110
// 11010
// 11000
// 00000
// Answer: 1

// Example 2:

// 11000
// 11000
// 00100
// 00011
// Answer: 3
public class NumberOfIslands {
    static char[][] sankGrid;

    public static int getNumIslands(char[][] grid){

        if (grid ==null || (grid.length == 0 && grid[0].length ==0) ){
            throw new IllegalArgumentException("grid must be not a null or empty");
        }

        sankGrid = new char[grid.length][grid[0].length];

        System.arraycopy(grid, 0, sankGrid, 0, grid.length);

        int islandsCount = 0;

        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                // sink the land and increment island count
                islandsCount += sink(i, j);
            }
        }

        return islandsCount;
    }

    private static int sink(int i, int j) {
        // out of bounds or water
        if ( i < 0 || i >= sankGrid.length || j < 0 || j>= sankGrid[0].length || sankGrid[i][j] == '0' ){
            return 0;
        }

        // sink current land cell
        sankGrid[i][j] = '0';

        // sink all neighbour cells with '1'
        sink(i, j -  1);
        sink(i, j +  1);
        sink(i - 1, j);
        sink(i + 1, j);

        return 1;

    }
}
