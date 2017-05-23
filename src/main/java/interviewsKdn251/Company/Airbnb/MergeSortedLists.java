package interviewsKdn251.Company.Airbnb;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by user on 15.04.2017.
 */
// Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
public class MergeSortedLists {

    public static ListNode mergeLists(ListNode[] lists){

        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val == o2.val) return 0;
                if (o1.val < o2.val) return -1;
                return  1;
            }
        });

        for (ListNode node : lists) {
            if (node != null){
                queue.add(node);
            }
        }

        ListNode head = new ListNode(0);
        ListNode current = head;

        while (!queue.isEmpty()){
            current.next = queue.poll();
            current = current.next;

            if (current.next != null)
                queue.add(current.next);
        }

        return head.next;

    }

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
