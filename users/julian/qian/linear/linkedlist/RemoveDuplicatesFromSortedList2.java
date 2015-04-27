package julian.qian.linear.linkedlist;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.leetcode.oj.util.ListNode;
/*
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers
from the original list.
For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.
 */
public class RemoveDuplicatesFromSortedList2 {
    public static ListNode run(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode p = head.next;
        if (head.val == p.val) {
            while (p != null && head.val == p.val) {
                p = p.next;               
            }
            return run(p);
        } else {
            head.next = run(head.next);
            return head;
        }
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }
}
