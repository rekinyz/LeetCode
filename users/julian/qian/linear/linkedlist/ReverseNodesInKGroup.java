package julian.qian.linear.linkedlist;

import com.leetcode.oj.ReverseNodesInKGroupTest;
import com.leetcode.oj.util.ListNode;
/*
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
You may not alter the values in the nodes, only nodes itself may be changed.
Only constant memory is allowed.
For example, Given this linked list: 1->2->3->4->5
For k = 2, you should return: 2->1->4->3->5
For k = 3, you should return: 3->2->1->4->5
 */
public class ReverseNodesInKGroup extends ReverseNodesInKGroupTest {
    @Override
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next ==null || k < 2) return head;
        ListNode next_group = head;
        for(int i = 0; i < k; ++i) {
            if (next_group != null) {
                next_group = next_group.next;
            } else {
                return head;
            }
        }
        ListNode new_next_group = reverseKGroup(next_group, k);
        ListNode prev = null, cur = head;
        while(cur !=next_group) {
            ListNode next = cur.next;
            cur.next = (prev !=null)? prev: new_next_group;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    /*
    @Override
    public ListNode reverseLinkedList(ListNode head, ListNode tail, int count) {
        return rnkg.reverseLinkedList(head, tail, count);
    }
    */
}
