package interviewsKdn251.Company.Amazon;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 16.04.2017.
 */
public class MergeKSortedListsSpec {
    @Test
    public void getMergeKSortedListsTest() throws Exception {
        MergeKSortedLists.ListNode src1 = new MergeKSortedLists.ListNode(8);
        MergeKSortedLists.ListNode src2 = new MergeKSortedLists.ListNode(2);
        MergeKSortedLists.ListNode src3 = new MergeKSortedLists.ListNode(5);
        src1.next =  new MergeKSortedLists.ListNode(16);
        src1.next.next =  new MergeKSortedLists.ListNode(20);
        src2.next =  new MergeKSortedLists.ListNode(3);
        src3.next =  new MergeKSortedLists.ListNode(6);
        src3.next.next =  new MergeKSortedLists.ListNode(7);

        MergeKSortedLists.ListNode[] arr = new MergeKSortedLists.ListNode[3];
        arr[0] = src1;
        arr[1] = src3;
        arr[2] = src2;

        MergeKSortedLists.ListNode actual = MergeKSortedLists.getMergedKSortedLists(arr);
        assertEquals(2,actual.val);
        assertEquals(3,actual.next.val);
        assertEquals(5,actual.next.next.val);

        while (actual.next != null){
            System.out.print(" " + String.valueOf(actual.val));
            actual = actual.next;
        }
    }

}