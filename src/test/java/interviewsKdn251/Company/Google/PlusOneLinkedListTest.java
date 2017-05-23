package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 09.05.2017.
 */
public class PlusOneLinkedListTest {
    @Test
    public void plusOneTest() throws Exception {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);

        ListNode result = PlusOneLinkedList.plusOne(root);

        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
    }

}