package interviewsKdn251.Company.Google;

/**
 * Created by user on 14.05.2017.
 */

// You are given a m x n 2D grid initialized with these three possible values.

// -1 - A wall or an obstacle.
// 0 - A gate.
// INF - Infinity means an empty room. We use the value 231 - 1 = 2147483647 to represent INF as you may assume
// that the distance to a gate is less than 2147483647.
// Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate, it should be filled
// with INF.

// For example, given the 2D grid:
// INF  -1  0  INF
// INF INF INF  -1
// INF  -1 INF  -1
//   0  -1 INF INF
// After running your function, the 2D grid should be:
//   3  -1   0   1
//   2   2   1  -1
//   1  -1   2  -1
//   0  -1   3   4

public class WallsAndGates {
    public static int[][] fill(int[][] hall){
        for (int i = 0; i < hall.length; i++){
            for(int j = 0; j < hall[0].length; j++){
                // launch dfs for gate cells
                if (hall[i][j] == 0){
                    process(hall, i, j, 0);
                }
            }
        }
        return hall;
    }

    private static void process(int[][] hall, int i, int j, int distance) {
        // if we run out of borders or current distance is less then argument return
        if (i < 0 || i >= hall.length || j < 0 || j >= hall[0].length || hall[i][j] < distance){
            return;
        }
        // new distance for current gate
        hall[i][j] = distance;

        //recursive set all other distance for this gate
        process(hall, i, j + 1, distance + 1);
        process(hall, i, j - 1, distance + 1);
        process(hall, i + 1, j, distance + 1);
        process(hall, i - 1, j, distance + 1);

    }
}
