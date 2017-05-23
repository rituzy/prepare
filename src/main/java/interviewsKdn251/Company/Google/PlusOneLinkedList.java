package interviewsKdn251.Company.Google;

/**
 * Created by user on 09.05.2017.
 */
// Given a non-negative integer represented as non-empty a singly linked list of digits, plus one to the integer.

// You may assume the integer do not contain any leading zero, except the number 0 itself.

// The digits are stored such that the most significant digit is at the head of the list.

// Example:
// Input:
// 1->2->3

// Output:
// 1->2->4
public class PlusOneLinkedList {
    public static ListNode plusOne(ListNode head) {
        // case when there is no new leading digit
        if(plusOneRecursive(head) == 0) {

            return head;

        }
        // case when there is a new leading digit( now the number starts from 1 )
        else {
            // new leading digit
            ListNode newHead = new ListNode(1);

            newHead.next = head;

            return newHead;

        }

    }

    private static int plusOneRecursive(ListNode head) {
        // if it is the (last element).next of the list, return 1 to break recursion
        if(head == null) return 1;
        // always 1 for the last element
        int carry = plusOneRecursive(head.next);
        // barrier : when carry is 0 then it's not needed to increment the value of the node
        // otherwise(at least for the last element when carry = 1) we go to the next point
        if(carry == 0) return 0;

        // if we reached this point, it's time to increment the digit
        int value = head.val + 1;
        // put the rest of division to the current node
        head.val = value % 10;
        // if the value is more than 10 we need to increment most signed digit as well(carry will be 1 again)
        return value/10;


    }
}
