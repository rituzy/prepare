package interviewsKdn251.Company.twitter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 21.05.2017.
 */
public class ReverseLinkedListTest {
    @Test
    public void reverseListTest() throws Exception {
        ListNode root = new ListNode(3);
        root.next = new ListNode(4);
        root.next.next = new ListNode(5);
        root.next.next.next = new ListNode(6);

        ListNode actual = ReverseLinkedList.reverseList(root);

        Assert.assertEquals(6, actual.val);
        Assert.assertEquals(5, actual.next.val);
        Assert.assertEquals(4, actual.next.next.val);
        Assert.assertEquals(3, actual.next.next.next.val);
    }

}