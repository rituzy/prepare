package interviewsKdn251.Company.Airbnb;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 15.04.2017.
 */
public class MergeSortedListsSpec {

    @Test
    public void mergeLists() throws Exception {

        MergeSortedLists.ListNode src1 = new MergeSortedLists.ListNode(8);
        MergeSortedLists.ListNode src2 = new MergeSortedLists.ListNode(2);
        MergeSortedLists.ListNode src3 = new MergeSortedLists.ListNode(5);
        src1.next =  new MergeSortedLists.ListNode(16);
        src1.next.next =  new MergeSortedLists.ListNode(20);
        src2.next =  new MergeSortedLists.ListNode(3);
        src3.next =  new MergeSortedLists.ListNode(6);
        src3.next.next =  new MergeSortedLists.ListNode(7);

        MergeSortedLists.ListNode[] arr = new MergeSortedLists.ListNode[3];
        arr[0] = src1;
        arr[1] = src3;
        arr[2] = src2;

        MergeSortedLists.ListNode actual = MergeSortedLists.mergeLists(arr);
        assertEquals(2,actual.val);
        assertEquals(3,actual.next.val);
        assertEquals(5,actual.next.next.val);

        while (actual.next != null){
            System.out.print(" " + String.valueOf(actual.val));
            actual = actual.next;
        }

    }

}