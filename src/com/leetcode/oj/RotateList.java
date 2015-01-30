package com.leetcode.oj;

import com.leetcode.oj.util.ListNode;

/**
 * Rotate List
 * 
 * Given a list, rotate the list to the right by k places, where k is
 * non-negative.
 * 
 * For example: Given 1->2->3->4->5->NULL and k = 2, return 4->5->1->2->3->NULL.
 * 
 * @author rekinyz
 *
 */
public class RotateList {

	public ListNode rotateRight(ListNode head, int n) {
		if (n == 0) {
			return head;
		} else if (n == 1) {
			ListNode p = head;
			ListNode beforeLast = p;
			ListNode remain = beforeLast;
			if(p==null||p.next==null){
				return p;
			}
			while (p != null && p.next != null) {
				if (p.next.next == null) {
					beforeLast = p;
				}
				p = p.next;
			}
			ListNode last = p;
			beforeLast.next = null;
			last.next = remain;
			return last;
		} else {
			for (; n > 0; n--) {
				head = rotateRight(head, 1);
			}
		}
		return head;
	}
}
