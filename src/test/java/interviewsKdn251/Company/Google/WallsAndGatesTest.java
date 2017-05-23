package interviewsKdn251.Company.Google;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by user on 14.05.2017.
 */

public class WallsAndGatesTest {
    @Test
    public void fillTest() throws Exception {
        int[][] hall = {
                {Integer.MAX_VALUE, -1               , 0                , Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -1},
                {Integer.MAX_VALUE, -1               , Integer.MAX_VALUE, -1},
                {0,                 -1               , Integer.MAX_VALUE, Integer.MAX_VALUE},
        };

        Arrays.stream(hall).forEach((int[] arr) -> {
            System.out.println();
            Arrays.stream(arr).forEach(i -> System.out.print(String.valueOf(i) + " ") );
        });
        System.out.println("\n---B---");

        int[][] namedRooms = WallsAndGates.fill(hall);

        Arrays.stream(namedRooms).forEach((int[] arr) -> {
            System.out.println();
            Arrays.stream(arr).forEach(i -> System.out.print(String.valueOf(i) + " ") );
        });

    }

}