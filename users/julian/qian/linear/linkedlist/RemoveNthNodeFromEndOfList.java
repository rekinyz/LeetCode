package julian.qian.linear.linkedlist;

import com.leetcode.oj.RemoveNthNodeFromEndOfListTest;
import com.leetcode.oj.util.ListNode;
/*
 * Given a linked list, remove the nth node from the end of list and return its head.
For example, Given linked list: 1->2->3->4->5, and n = 2.
After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
• Given n will always be valid.
• Try to do this in one pass.
分析
设两个指针p; q，让q 先走n 步，然后p 和q 一起走，直到q 走到尾节点，删除p->next 即可。
 */
public class RemoveNthNodeFromEndOfList extends RemoveNthNodeFromEndOfListTest {
    @Override
    public ListNode removeNthFromEnd(int[] input, int n) {
        ListNode head = ListNode.convert(input);
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy, q = dummy;
        for(int i = 0; i < n; i++) {
            q = q.next;
        }
        while (q.next!= null) {
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;
        return dummy.next;
        
    }
}
