package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 18.04.2017.
 */
public class ExpressionAddOperatorsSpec {
    @Test
    public void addOperatorsTest() throws Exception {
        Assert.assertEquals("1+2+3", ExpressionAddOperators.addOperators("123", 6).get(0));
        Assert.assertEquals("1*2*3", ExpressionAddOperators.addOperators("123", 6).get(1));

        Assert.assertEquals("2+3*2", ExpressionAddOperators.addOperators("232", 8).get(0));
        Assert.assertEquals("2*3+2", ExpressionAddOperators.addOperators("232", 8).get(1));

        Assert.assertEquals("1*0+5", ExpressionAddOperators.addOperators("105", 5).get(0));
        Assert.assertEquals("10-5", ExpressionAddOperators.addOperators("105", 5).get(1));

        Assert.assertEquals("0+0", ExpressionAddOperators.addOperators("00", 0).get(0));
        Assert.assertEquals("0-0", ExpressionAddOperators.addOperators("00", 0).get(1));
        Assert.assertEquals("0*0", ExpressionAddOperators.addOperators("00", 0).get(2));

        Assert.assertEquals(0, ExpressionAddOperators.addOperators("3456237490", 9191 ).size());
    }

}