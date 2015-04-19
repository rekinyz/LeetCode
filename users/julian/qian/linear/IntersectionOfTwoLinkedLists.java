package julian.qian.linear;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.leetcode.oj.util.ListNode;

public class IntersectionOfTwoLinkedLists {
/********************************************************************************** 
 * 
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * 
 * For example, the following two linked lists: 
 * 
 *
 *    A:          a1 → a2
 *                       ↘
 *                         c1 → c2 → c3
 *                       ↗            
 *    B:     b1 → b2 → b3
 * 
 * begin to intersect at node c1.
 * 
 * Notes:
 * 
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns. 
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 *               
 **********************************************************************************/
    public static int getLen(ListNode head) {
        int len = 0;
        while(head != null) {
            head = head.next;
            len++;
        }
        return len;
    }
    public static ListNode run(ListNode a, ListNode b) {
        int lenA = getLen(a);
        int lenB = getLen(b);
        if (lenA <= 0 || lenB <= 0) return null;
        if (lenA < lenB) return run(b, a);
        int diff = lenA-lenB;
        for (int i = 0; i < diff; ++i) {
            a = a.next;
        }
        while (a != b) {
            a = a.next;
            b = b.next;
        }
        return a;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
