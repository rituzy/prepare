package interviewsKdn251.Company.coursera_algorithm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 28.05.2017.
 */
public class Queue2StacksTest {
    @Test
    public void testAll() {
        Queue2Stacks<Integer> qs = new Queue2Stacks<>();

        qs.enqueue(1);
        qs.enqueue(2);
        qs.enqueue(3);

        System.out.println("Deque : "+qs.deque());

        qs.enqueue(4);
        qs.enqueue(5);

        System.out.println("Deque : "+qs.deque());
        System.out.println("Deque : "+qs.deque());
        System.out.println("Deque : "+qs.deque());
        Assert.assertEquals(1, qs.size());
    }
}