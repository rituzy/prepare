package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 23.04.2017.
 */
// You are given a m x n 2D grid initialized with these three possible values.

// -1 - A wall or an obstacle.
// 0 - A gate.
// INF - Infinity means an empty room. We use the value 231 - 1 = 2147483647 to represent INF
// as you may assume that the distance to a gate is less than 2147483647.
// Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate,
// it should be filled with INF.

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
    public static int[][] nameRooms(int[][] hole){
        if (hole == null || hole[0].length == 0){
            return null;
        }
        int[][] namedRooms = new int[hole.length][hole[0].length];

        System.arraycopy(hole, 0, namedRooms, 0, hole.length);

        for  (int i = 0; i < namedRooms.length; i++){
            for (int j = 0; j < namedRooms[0].length; j ++){
                if (namedRooms[i][j] == 0) {
                    dfs(namedRooms, i, j, 0);
                }
            }
        }

        return namedRooms;

    }

    private static void dfs(int[][] namedRooms, int i, int j, int distance) {
        // if index is out of bounds or it's obstacle get out
        // namedRooms[i][j] ensures that we won't override the previous distatnc(than shorter)
        if ( i < 0 || i >= namedRooms.length || j < 0 || j >= namedRooms[0].length
                || namedRooms[i][j] < distance){
            return;
        }

        // mark the room with distance from gate(distance for gate is 0)
        namedRooms[i][j] = distance;

        // mark all the neighbours
        dfs(namedRooms, i - 1, j, distance + 1);
        dfs(namedRooms, i + 1, j, distance + 1);
        dfs(namedRooms, i, j - 1, distance + 1);
        dfs(namedRooms, i, j + 1, distance + 1);

        return;

    }
}
