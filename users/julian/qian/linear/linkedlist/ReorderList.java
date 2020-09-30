package julian.qian.linear.linkedlist;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.leetcode.oj.util.ListNode;

public class ReorderList {
    public static void run(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode slow = head, fast = head, prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        slow = reverse(slow);
        // merge
        ListNode curr = head;
        while (curr.next != null) {
            ListNode tmp = curr.next;
            curr.next = slow;
            slow = slow.next;
            curr.next.next = tmp;
            curr = tmp;
        }
        curr.next = slow;
    }
    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = head;
        for (ListNode curr = head.next, next = curr.next; curr !=  null;
                prev = curr, curr = next, next= next != null ? next.next: null) {
            curr.next = prev;
        }
        head.next = null;
        return prev;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
