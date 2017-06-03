package interviewsKdn251.Company.coursera_algorithm;

import interviewsKdn251.Company.Amazon.MergeKSortedLists;

import java.util.LinkedList;

/**
 * Created by user on 30.05.2017.
 */
public class ShufflingLinkedList {
    static ListNode head;  // head of list
    
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

    }
    static void printlist(ListNode node) {
        if (node == null) {
            return;
        }
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
    }

    static ListNode reverselist(ListNode node) {

        ListNode newHead = null;

        while (node != null) {
            ListNode next = node.next;
            node.next = newHead;
            newHead = node;
            node = next;
        }

        return newHead;
    }

    static void rearrange(ListNode node) {

        // 1) Find the middle point using tortoise and hare method
        ListNode slow = node, fast = slow.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null){
            slow = slow.next;
        }

        // 2) Split the linked list in two halves
        // node1, head of first half    1 -> 2 -> 3
        // node2, head of second half   4 -> 5
        ListNode node1 = node;
        ListNode node2 = slow.next;
        slow.next = null;

        // 3) Reverse the second half, i.e., 5 -> 4
        node2 = reverselist(node2);

        // 4) Merge alternate nodes : dummy head
        node = new ListNode(0); // Assign dummy ListNode

        // curr is the pointer to this dummy ListNode, which will
        // be used to form the new list
        ListNode curr = node;
        while (node1 != null || node2 != null) {

            // First add the element from first list
            if (node1 != null) {
                curr.next = node1;
                curr = curr.next;
                node1 = node1.next;
            }

            // Then add the element from second list
            if (node2 != null) {
                curr.next = node2;
                curr = curr.next;
                node2 = node2.next;
            }
        }

        // Assign the head of the new list to head pointer from dummy head
        node = node.next;
    }

    public static void main(String[] args) {

        ListNode list = new ListNode(2);
        list.next = new ListNode(1);
        list.next.next = new ListNode(2);
        list.next.next.next = new ListNode(3);
        list.next.next.next.next = new ListNode(4);
        list.next.next.next.next.next = new ListNode(5);

        printlist(list); // print original list
        rearrange(list); // rearrange list as per ques
        System.out.println("");
        printlist(list); // print modified list

    }
}
