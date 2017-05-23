package interviewsKdn251.Company.Airbnb;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by user on 15.04.2017.
 */
public class AddTwoNumbersTest {

    @Test
    public void when342Plus465Then807() throws Exception {
        LinkedList<Integer> first = new LinkedList<Integer>();
        first.add(2);
        first.add(4);
        first.add(3);

        LinkedList<Integer> second = new LinkedList<Integer>();
        second.add(5);
        second.add(6);
        second.add(4);

        LinkedList<Integer> expected = new LinkedList<Integer>();
        expected.add(7);
        expected.add(0);
        expected.add(8);

        LinkedList<Integer> actual = ( new AddTwoNumbers(first, second) ).addition();

        Assert.assertEquals(expected.size(), actual.size());

        Assert.assertEquals(expected.getFirst(), actual.getFirst());
        Assert.assertEquals(expected.get(1), actual.get(1));
        Assert.assertEquals(expected.getLast(), actual.getLast());

    }

    @Test
    public void whenFist342ThenFirstStr342(){
        LinkedList<Integer> first = new LinkedList<Integer>();
        first.add(3);
        first.add(4);
        first.add(2);

        LinkedList<Integer> second = new LinkedList<Integer>();
        second.add(4);
        second.add(6);
        second.add(5);

        AddTwoNumbers atn = new AddTwoNumbers(first, second);
        Integer actual = atn.convert2Int(atn.convert2String(first));

        Integer expected = 243;

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void whenResult564ThenList465(){
        LinkedList<Integer> first = new LinkedList<Integer>();
        first.add(3);
        first.add(4);
        first.add(2);

        LinkedList<Integer> second = new LinkedList<Integer>();
        second.add(4);
        second.add(6);
        second.add(5);

        AddTwoNumbers atn = new AddTwoNumbers(first, second);

        LinkedList<Integer> third = new LinkedList<Integer>();
        third.add(4);
        third.add(6);
        third.add(5);

        LinkedList<Integer> actual = atn.convert2List( new StringBuilder("564") );

        Assert.assertEquals(third.getFirst(), actual.getFirst());
        Assert.assertEquals(third.get(1), actual.get(1));
        Assert.assertEquals(third.getLast(), actual.getLast());

    }

    @Test
    public void addTwoNumbersTest(){
        AddTwoNumbers.Node n1 = new AddTwoNumbers.Node(2);

        n1.next = new AddTwoNumbers.Node(4);
        n1.next.next = new AddTwoNumbers.Node(3);

        AddTwoNumbers.Node n2 = new AddTwoNumbers.Node(5);
        n2.next = new AddTwoNumbers.Node(6);
        n2.next.next = new AddTwoNumbers.Node(4);

        AddTwoNumbers.Node actual = AddTwoNumbers.addTwoNumbers(n1, n2);

        assertEquals(7, actual.val);
        assertEquals(0, actual.next.val);
        assertEquals(8, actual.next.next.val);
    }
}
