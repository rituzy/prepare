package interviewsKdn251.Company.twitter;

import java.util.List;

/**
 * Created by user on 21.05.2017.
 */
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head){
        ListNode newNode = null;

        while (head != null){
            ListNode next = head.next;
            head.next = newNode;
            newNode = head;
            head = next;
        }
        return newNode;
    }
}
