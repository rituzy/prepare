package interviewsKdn251.Company.LinkedIn;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 20.05.2017.
 */
public class MergeKSortedListsTest {
    @Test
    public void mergeTest() throws Exception {
        ListNode src1 = new ListNode(8);
        ListNode src2 = new ListNode(2);
        ListNode src3 = new ListNode(5);
        src1.next =  new ListNode(16);
        src1.next.next =  new ListNode(20);
        src2.next =  new ListNode(3);
        src3.next =  new ListNode(6);
        src3.next.next =  new ListNode(7);

        ListNode[] arr = new ListNode[3];
        arr[0] = src1;
        arr[1] = src3;
        arr[2] = src2;

        ListNode actual = MergeKSortedLists.merge(arr);
        assertEquals(2,actual.val);
        assertEquals(3,actual.next.val);
        assertEquals(5,actual.next.next.val);

        while (actual.next != null){
            System.out.print(" " + String.valueOf(actual.val));
            actual = actual.next;
        }

    }

}