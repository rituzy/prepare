package interviewsKdn251.Company.Amazon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by user on 16.04.2017.
 */

// Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

public class MergeKSortedLists {

    public static ListNode getMergedKSortedLists(ListNode[] lists){

        if (lists == null || lists.length == 0){
            throw new IllegalArgumentException();
        }

        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length,new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val < o2.val) return -1;
                if (o1.val == o2.val) return 0;
                return 1;
            }
        });

        for(ListNode ln : lists){
            if (ln != null){
                queue.add(ln);
            }
        }

        ListNode head = new ListNode(0);
        ListNode current = head;

        while (!queue.isEmpty()){
            current.next = queue.poll();
            current = current.next;

            if (current.next != null){
                queue.add(current.next);
            }
        }

        return head.next;
    }

    public static class ListNode{
        public int val;
        public ListNode next;

         public ListNode(int val) {
             this.val = val;
         }
    }
}
