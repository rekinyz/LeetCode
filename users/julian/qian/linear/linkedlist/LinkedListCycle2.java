package julian.qian.linear.linkedlist;

import com.leetcode.oj.LinkedListCycle2Test;
import com.leetcode.oj.util.ListNode;
/*
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * 当fast 与slow 相遇时，slow 肯定没有遍历完链表，而fast 已经在环内循环了n 圈(1  n)。假
设slow 走了s 步，则fast 走了2s 步（fast 步数还等于s 加上在环上多转的n 圈），设环长为r，则：
2s = s + nr
s = nr
设整个链表长L，环入口点与相遇点距离为a，起点到环入口点的距离为x，则
x + a = nr = (n–1)r + r = (n - 1)r + L - x
x = (n - 1)r + (L–x–a)
L–x–a 为相遇点到环入口点的距离，由此可知，从链表头到环入口点等于n - 1 圈内环+ 相遇
点到环入口点，于是我们可以从head 开始另设一个指针slow2，两个慢指针每次前进一步，它俩
一定会在环入口点相遇。
 */
public class LinkedListCycle2 extends LinkedListCycle2Test {
    public ListNode run(ListNode head) {
        
    }
    @Override
    public ListNode detectCycle(int[] input) {
        ListNode node = ListNode.convert(input);
        return run(node);
    }

    @Override
    public ListNode detectCycle(int[] input, int n) {
        ListNode node = ListNode.cycle(input, n);
        return run(node);
    }
}
