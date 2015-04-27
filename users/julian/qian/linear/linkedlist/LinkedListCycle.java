package julian.qian.linear.linkedlist;

import com.leetcode.oj.LinkedListCycleTest;
import com.leetcode.oj.util.ListNode;

public class LinkedListCycle extends LinkedListCycleTest {
    public boolean run(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast !=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
    @Override
    public boolean hasCycle(int[] input) {
        ListNode list = ListNode.convert(input);
        return run(list);
    }

    @Override
    public boolean hasCycle(int[] input, int n) {
        ListNode list = ListNode.cycle(input, n);
        return run(list);
    }
}
