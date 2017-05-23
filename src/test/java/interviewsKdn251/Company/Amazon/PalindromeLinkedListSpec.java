package interviewsKdn251.Company.Amazon;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 16.04.2017.
 */
public class PalindromeLinkedListSpec {
    @Test
    public void isPalindromeTest() throws Exception {

        PalindromeLinkedList.ListNode root = new PalindromeLinkedList.ListNode(1);
        root.next = new PalindromeLinkedList.ListNode(2);
        root.next.next = new PalindromeLinkedList.ListNode(3);
        root.next.next.next = new PalindromeLinkedList.ListNode(2);
        root.next.next.next.next = new PalindromeLinkedList.ListNode(1);

        PalindromeLinkedList.ListNode rootFalse = new PalindromeLinkedList.ListNode(6);
        rootFalse.next = new PalindromeLinkedList.ListNode(4);
        rootFalse.next.next = new PalindromeLinkedList.ListNode(3);
        rootFalse.next.next.next = new PalindromeLinkedList.ListNode(5);
        rootFalse.next.next.next.next = new PalindromeLinkedList.ListNode(1);

        Assert.assertTrue(PalindromeLinkedList.isPalindrome(root));
        Assert.assertFalse(PalindromeLinkedList.isPalindrome(rootFalse));
    }

}