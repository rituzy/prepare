package interviewsKdn251.Company.Facebook;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by user on 23.04.2017.
 */
public class WallsAndGatesTest {
    @Test
    public void nameRooms() throws Exception {
        int[][] hole = {
                {Integer.MAX_VALUE, -1               , 0                , Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -1},
                {Integer.MAX_VALUE, -1               , Integer.MAX_VALUE, -1},
                {0,                 -1               , Integer.MAX_VALUE, Integer.MAX_VALUE},
        };

        Arrays.stream(hole).forEach((int[] arr) -> {
            System.out.println();
            Arrays.stream(arr).forEach(i -> System.out.print(String.valueOf(i) + " ") );
        });
        System.out.println("\n---B---");

        int[][] namedRooms = WallsAndGates.nameRooms(hole);

        Arrays.stream(namedRooms).forEach((int[] arr) -> {
            System.out.println();
            Arrays.stream(arr).forEach(i -> System.out.print(String.valueOf(i) + " ") );
        });

    }

}