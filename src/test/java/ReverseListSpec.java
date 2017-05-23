import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 13.04.2017.
 */
public class ReverseListSpec {
    @Test
    public void reverse() throws Exception {
        ReverseList.LinkedList<String> three = new ReverseList.LinkedList<String>("3", null);
        ReverseList.LinkedList<String> two = new ReverseList.LinkedList<String>("2", three);
        ReverseList.LinkedList<String> one = new ReverseList.LinkedList<String>("1", two);

        ReverseList.LinkedList<String> reversed = ReverseList.reverse(one);

        assertEquals("3", reversed.getElement());
        assertEquals("2", reversed.getNext().getElement());
        assertEquals("1", reversed.getNext().getNext().getElement());
    }

}