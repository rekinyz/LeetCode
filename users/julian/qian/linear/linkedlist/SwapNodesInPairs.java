package julian.qian.linear.linkedlist;

import com.leetcode.oj.SwapNodesInPairsTest;
import com.leetcode.oj.util.ListNode;
/*
 * Given a linked list, swap every two adjacent nodes and return its head.
For example, Given 1->2->3->4, you should return the list as 2->1->4->3.
最简单是swap value, swap指针麻烦一些
 */
public class SwapNodesInPairs extends SwapNodesInPairsTest {
    @Override
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        for (ListNode prev = dummy, cur = prev.next, next = cur.next;next != null;
                prev = cur,cur=cur.next,next = (cur!=null)?cur.next:null) {
            prev.next = next;
            cur.next = next.next;
            next.next = cur;
        }
        return dummy.next;
    }
    public static ListNode swapValue(ListNode head) {
        ListNode p = head;
        while(p != null && p.next != null){
            int t = p.val;
            p.val = p.next.val;
            p.next.val = t;
            p = p.next.next;
        }
        return head;
    }
}
