package interviewsKdn251.Company.Amazon;

import java.util.Stack;

/**
 * Created by user on 16.04.2017.
 */

// check if linked list of ints is palindrome
// Input: [1 -> 2 -> 3 -> 2 -> 1] , Output: true
// Input: [6 -> 4 -> 3 -> 5 -> 1] , Output: false

public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode list){
        if (list == null){
            throw new IllegalArgumentException("list must be not a null");
        }

        ListNode slowPtr = list;
        ListNode fastPtr = list;

        Stack<Integer> firstHalfValues = new Stack<>();

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            firstHalfValues.push(slowPtr.val);
            slowPtr = slowPtr.next;
        }

        if (fastPtr != null){
            slowPtr = slowPtr.next;
        }

        while (slowPtr != null){
            if (firstHalfValues.pop() != slowPtr.val) return false;
            slowPtr = slowPtr.next;
        }

        return true;
    }

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

}
