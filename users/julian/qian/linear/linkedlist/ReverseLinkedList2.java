package julian.qian.linear.linkedlist;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.leetcode.oj.util.ListNode;
/*
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
For example: Given 1->2->3->4->5->nullptr, m = 2 and n = 4,
return 1->4->3->2->5->nullptr.
Note: Given m, n satisfy the following condition: 1  m  n  length of list.
 */
public class ReverseLinkedList2 {
    public static ListNode run(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        for (int i = 0; i < m-1; ++i) {
            prev = prev.next;
        }
        ListNode head2 = prev;
        prev = prev.next;
        if(prev == null) return dummy.next;
        ListNode cur = prev.next;
        for (int i = m; i < n; ++i) { // 这是假设一定有N
            prev.next = cur.next; // prev的下一个要指向下一个cur
            cur.next = head2.next; // 把cur的指针反转
            head2.next = cur; // 移动到下一个要反转的节点
            cur = prev.next; // 前进当前指针
        }
        return dummy.next;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
