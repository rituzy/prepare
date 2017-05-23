package interviewsKdn251.Company.Uber;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by user on 22.05.2017.
 */
public class MergeKSortedLists {
    public static ListNode merge(ListNode[] lists){
        if (lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return Integer.compare(o1.val, o2.val);
            }
        });

        ListNode first = new ListNode(0);
        ListNode tail = first;

        for (ListNode ln : lists){
            if (ln != null){
                queue.add(ln);
            }
        }

        while(!queue.isEmpty()){
            tail.next = queue.poll();
            tail = tail.next;

            if (tail.next != null){
                queue.add(tail.next);
            }
        }

        return first.next;
    }
}
