package sort;

import com.leetcode.oj.MergeTwoSortedListsTest;
import com.leetcode.oj.util.ListNode;

public class MergeTwoSortedLists extends MergeTwoSortedListsTest {
    public static ListNode run(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        for(;l1 != null && l2 != null; p = p.next){
            if (l1.val > l2.val) {
                p.next = l2;
                l2 = l2.next;
            } else {
                p.next = l1;
                l1 = l1.next;
            }
        }
        p.next = (l1 != null)? l1:l2;
        return dummy.next;
    }
    @Override
    public ListNode mergeTwoLists(int[] a1, int[] a2) {
        ListNode l1 = ListNode.convert(a1);
        ListNode l2 = ListNode.convert(a2);
        return run(l1,l2);
    }

}
