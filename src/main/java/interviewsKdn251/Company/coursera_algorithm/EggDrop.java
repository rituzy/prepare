package interviewsKdn251.Company.coursera_algorithm;

/**
 * Created by user on 28.05.2017.
 * Egg drop. Suppose that you have an n-story building (with floors 1 through n) and plenty of eggs. An egg breaks if it is dropped from floor T or higher and does not break otherwise. Your goal is to devise a strategy to determine the value of T given the following limitations on the number of eggs and tosses:

 Version 0: 1 egg, ≤T tosses.
 Version 1: ∼1lgn eggs and ∼1lgn tosses.
 Version 2: ∼lgT eggs and ∼2lgT tosses.
 Version 3: 2 eggs and ∼2n√ tosses.
 Version 4: 2 eggs and ≤cT−−√ tosses for some fixed constant c.
 */
public class EggDrop {
    /* Function to get minimum number of trails needed in worst
    case with n eggs and k floors */
    static int eggDrop(int n, int k)
    {
       /* A 2D table where entery eggFloor[i][j] will represent minimum
       number of trials needed for i eggs in rows and j floors in columns. */
        int eggFloor[][] = new int[n+1][k+1];
        int res;
        int row, col, x;

        // We need one trial for one floor and 0 trials for 0 floors:
        // does not matter how many eggs if there are no levels : always 0
        // does not matter how many eggs if there is 1 level : always 1
        for (row = 1; row <= n; row++)
        {
            eggFloor[row][1] = 1;
            eggFloor[row][0] = 0;
        }

        // We always need j trials for one egg and j floors:
        // We will go up level by level and drop the egg until it's broken(that would be the level to find)
        for (col = 1; col <= k; col++)
            eggFloor[1][col] = col;

        // Fill rest of the entries in table using optimal substructure
        // property
        for (row = 2; row <= n; row++)
        {
            for (col = 2; col <= k; col++)
            {
                // start with maximum value for future compare
                eggFloor[row][col] = Integer.MAX_VALUE;
                for (x = 1; x <= col; x++)
                {
                    // current value as sum 1 and maximum value from value of previous floor from left side (x-1) and
                    // value of current floor  and right side
                    res = 1 + Math.max(eggFloor[row-1][x-1], eggFloor[row][col-x]);

                    if (res < eggFloor[row][col])
                        eggFloor[row][col] = res;
                }
            }
        }

        // eggFloor[n][k] holds the result
        return eggFloor[n][k];

    }

}
