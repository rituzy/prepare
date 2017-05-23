package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 25.04.2017.
 */
public class ExpressionAddOperatorsTest {
    @Test
    public void addOperatorsTest() throws Exception {
        Assert.assertEquals("1+2+3", ExpressionAddOperators.getOperatorCombinations("123", 6).get(0));
        Assert.assertEquals("1*2*3", ExpressionAddOperators.getOperatorCombinations("123", 6).get(1));

        Assert.assertEquals("2+3*2", ExpressionAddOperators.getOperatorCombinations("232", 8).get(0));
        Assert.assertEquals("2*3+2", ExpressionAddOperators.getOperatorCombinations("232", 8).get(1));

        Assert.assertEquals("1*0+5", ExpressionAddOperators.getOperatorCombinations("105", 5).get(0));
        Assert.assertEquals("10-5", ExpressionAddOperators.getOperatorCombinations("105", 5).get(1));

        Assert.assertEquals("0+0", ExpressionAddOperators.getOperatorCombinations("00", 0).get(0));
        Assert.assertEquals("0-0", ExpressionAddOperators.getOperatorCombinations("00", 0).get(1));
        Assert.assertEquals("0*0", ExpressionAddOperators.getOperatorCombinations("00", 0).get(2));

        Assert.assertEquals(0, ExpressionAddOperators.getOperatorCombinations("3456237490", 9191).size());
    }
}