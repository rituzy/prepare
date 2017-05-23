package interviewsKdn251.Company.Amazon;

/**
 * Created by user on 16.04.2017.
 */

// Reverse a singly linked list.

public class ReverseLinkedList {

    public static ListNode reverse(ListNode head){
        if (head == null){
            throw new IllegalArgumentException("list must not be a null");
        }

        ListNode newHead = null;

        while (head != null){
            // preserve old next element before it's being changed
            ListNode next = head.next;
            // head now points to last element
            head.next = newHead;
            // save last processed element for next iteration
            newHead = head;
            // iterate to next element preserved earlier
            head = next;
        }


        return newHead;
    }

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
