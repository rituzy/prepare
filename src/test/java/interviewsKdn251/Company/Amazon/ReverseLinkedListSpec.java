package interviewsKdn251.Company.Amazon;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 16.04.2017.
 */
public class ReverseLinkedListSpec {
    @Test
    public void reverseTest() throws Exception {
        ReverseLinkedList.ListNode root = new ReverseLinkedList.ListNode(3);
        root.next = new ReverseLinkedList.ListNode(4);
        root.next.next = new ReverseLinkedList.ListNode(5);
        root.next.next.next = new ReverseLinkedList.ListNode(6);

        ReverseLinkedList.ListNode actual = ReverseLinkedList.reverse(root);

        Assert.assertEquals(6, actual.val);
        Assert.assertEquals(5, actual.next.val);
        Assert.assertEquals(4, actual.next.next.val);
        Assert.assertEquals(3, actual.next.next.next.val);
    }

}