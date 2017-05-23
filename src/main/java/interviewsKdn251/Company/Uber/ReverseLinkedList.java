package interviewsKdn251.Company.Uber;


/**
 * Created by user on 22.05.2017.
 */
// Reverse a singly linked list.
public class ReverseLinkedList {
    public static ListNode reverse(ListNode node){
        ListNode newNode = null;

        while (node != null){
            ListNode next = node.next;
            node.next = newNode;
            newNode = node;
            node = next;
        }

        return newNode;
    }
}
