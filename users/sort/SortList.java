package sort;

import com.leetcode.oj.SortListTest;
import com.leetcode.oj.util.ListNode;

public class SortList extends SortListTest {

    @Override
    protected ListNode sortList(int... array) {
        ListNode node = ListNode.convert(array);
        return sort(node);
    }
    public static ListNode sort(ListNode node) {
        if (node == null || node.next == null) return node;
        ListNode fast = node, slow = node;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = slow;
        slow = slow.next;
        fast.next = null;
        ListNode l1 = sort(node);
        ListNode l2 = sort(slow);
        return MergeTwoSortedLists.run(l1, l2);
    }
}
