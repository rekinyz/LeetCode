package julian.qian.linear.linkedlist;

import com.leetcode.oj.RemoveDuplicatesFromSortedListTest;
import com.leetcode.oj.util.ListNode;
/*
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicatesFromSortedList extends RemoveDuplicatesFromSortedListTest {
    @Override
    public ListNode deleteDuplicates(int... array) {
        ListNode node = ListNode.convert(array);
        if (node == null) return node;
        ListNode dummy = new ListNode(node.val+1);
        dummy.next = node;
        recur(dummy, node);
        return dummy.next;
    }
    public static void recur(ListNode prev, ListNode cur) {
        if (cur==null) return;
        if (prev.val == cur.val) {
            prev.next = cur.next;
            recur(prev, prev.next);
        } else {
            recur(prev.next, cur.next);
        }
    }
}
