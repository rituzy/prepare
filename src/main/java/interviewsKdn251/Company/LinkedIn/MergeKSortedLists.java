package interviewsKdn251.Company.LinkedIn;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by user on 20.05.2017.
 */

// Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
public class MergeKSortedLists {
    public static ListNode merge(ListNode[] list){
        if (list == null || list.length == 0) return null;

        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return Integer.compare(o1.val, o2.val);
            }
        });

        ListNode firstEl = new ListNode(0);
        ListNode tail = firstEl;

        for (ListNode ln : list){
            queue.add(ln);
        }

        while (!queue.isEmpty()){
            tail.next = queue.poll();
            tail = tail.next;

            if (tail.next != null){
                queue.add(tail.next);
            }
        }

        return firstEl.next;

    }
}
