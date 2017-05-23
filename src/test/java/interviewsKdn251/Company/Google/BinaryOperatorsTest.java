package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 08.05.2017.
 */
public class BinaryOperatorsTest {
    @Test
    public void BinaryOperatorsTest(){
        String str = "tyiuo";

        int val = 0;
        int vals = 0;
        for (int j = 0 ; j < str.length(); j++){
            System.out.println(str.charAt(j));
            System.out.println(str.charAt(j) - 'a');
            System.out.println(1 << (str.charAt(j) - 'a'));
            System.out.println(0| (1 << (str.charAt(j) - 'a')) );
            val |= (1 << (str.charAt(j) - 'a'));
            System.out.println("val | = " + val);
            vals += (1 << (str.charAt(j) - 'a'));
            System.out.println("vals += " + vals);
        }
    }

}
