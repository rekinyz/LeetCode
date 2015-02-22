package com.leetcode.oj;

import com.leetcode.oj.util.ListNode;

/**
 * Swap Nodes in Pairs
 * 
 * Given a linked list, swap every two adjacent nodes and return its head.
 * 
 * For example, Given 1->2->3->4, you should return the list as 2->1->4->3.
 * 
 * Your algorithm should use only constant space. You may not modify the values
 * in the list, only nodes itself can be changed.
 * 
 * @author rekinyz
 */
public class SwapNodesInPairs {

	public ListNode swapPairs(ListNode head) {
		ListNode p = head;
		int flag = 1;
		while (p != null && p.next != null) {
			if (flag == 1) {
				int tmp = p.val;
				p.val = p.next.val;
				p.next.val = tmp;
			}
			flag *= -1;
			p = p.next;
		}
		return head;
	}

}
