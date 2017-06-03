package streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by user on 03.06.2017.
 */
public class ExersizesTest {


    @Test
    public void uniqueCitiesTest() {
        Assert.assertEquals(Arrays.asList("Cambridge", "Milan"), Exersizes.uniqueCities());
    }



    @Test
    public void allNamesStringTest(){
        Assert.assertEquals("Alan Brian Mario Raoul", Exersizes.getAllNames());
    }

    @Test
    public void findInMilanTest(){
        Exersizes.isInMilan();
    }

    @Test
    public void printTransCambridgeTest(){
        Exersizes.printCambridgeTrans();
    }

    @Test
    public void getMaxTest(){
        Assert.assertEquals(1000, Exersizes.findHighestVal());
    }

    @Test
    public void getSmallestTranTest(){
        Assert.assertEquals(new Transaction(new Trader("Brian","Cambridge"), 2011, 300),
                Exersizes.getSmallestTran());
    }


    /*
    @Test
    public void findCambridgeTest() {
        Assert.assertEquals(Arrays.asList(
                new Trader("Alan","Cambridge"),
                new Trader("Brian","Cambridge"),
                new Trader("Raoul", "Cambridge")
        ), Exersizes.findCambridgeTraders());
    }

    @Test
    public void findTran2011Test() throws Exception {
        Assert.assertEquals(Arrays.asList(
                new Transaction(new Trader("Brian","Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400)
                ), Exersizes.findTran2011()
        );
    }
    */

}