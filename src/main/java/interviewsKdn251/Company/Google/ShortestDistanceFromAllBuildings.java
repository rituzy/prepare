package interviewsKdn251.Company.Google;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by user on 13.05.2017.
 */
// You want to build a house on an empty land which reaches all buildings in the shortest amount of distance. You can only move up, down, left and right. You are given a 2D grid of values 0, 1 or 2, where:

// Each 0 marks an empty land which you can pass by freely.
// Each 1 marks a building which you cannot pass through.
// Each 2 marks an obstacle which you cannot pass through.
// For example, given three buildings at (0,0), (0,4), (2,2), and an obstacle at (0,2):

// 1 - 0 - 2 - 0 - 1
// |   |   |   |   |
// 0 - 0 - 0 - 0 - 0
// |   |   |   |   |
// 0 - 0 - 1 - 0 - 0
// The point (1,2) is an ideal empty land to build a house, as the total travel distance of 3+3+1=7 is minimal. So return 7.

// Note:
// There will be at least one building. If it is not possible to build such house according to the above rules, return -1.
public class ShortestDistanceFromAllBuildings {

    public static int getShortDistance(int[][] land){

        int buildings = 0;
        int[] shifts = {0, 1, 0, -1, 0  };

        int m = land.length;
        int n = land[0].length;

        int[][] reach = new int[m][n];
        int[][] distance = new int[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (land[i][j] == 1){
                    buildings++;

                    int relativeDist = 1;

                    Queue<int[]> queue = new LinkedList<>();
                    queue.add(new int[]{i, j});
                    boolean[][] visited = new boolean[m][n];

                    while (!queue.isEmpty()){

                        int queueSize = queue.size();

                        for (int q = 0 ; q < queueSize; q++) {

                            int[] curEl = queue.poll();

                            for (int k = 0; k < 4; k++) {
                                int nextI = curEl[0] + shifts[k];
                                int nextJ = curEl[1] + shifts[k + 1];

                                if (nextI >= 0 && nextI < m && nextJ >= 0 && nextJ < n
                                        && land[nextI][nextJ] == 0 && !visited[nextI][nextJ]) {
                                    visited[nextI][nextJ] = true;
                                    distance[nextI][nextJ] += relativeDist;
                                    reach[nextI][nextJ]++;

                                    queue.offer(new int[]{nextI, nextJ});
                                }
                            }
                        }

                        relativeDist++;

                    }


                }
            }
        }

        int shortest = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++){
            for (int j = 0 ; j < n; j++){
                if ( land[i][j] == 0 && reach[i][j] == buildings ){
                    shortest = Math.min(shortest, distance[i][j]);
                }
            }
        }

        return shortest == Integer.MAX_VALUE ? -1 : shortest;
    }


}
