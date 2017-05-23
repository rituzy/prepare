package interviewsKdn251.Company.Airbnb;

import org.junit.Test;

import java.util.stream.IntStream;

/**
 * Created by user on 15.04.2017.
 */
public class RobberSpec {
    @Test
    public void gemMaxMoneyTest() throws Exception {
        int[] src = IntStream.rangeClosed(0, 100).toArray();

        Robber.gemMaxMoney(src);

    }

}