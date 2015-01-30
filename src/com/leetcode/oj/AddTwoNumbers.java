package com.leetcode.oj;

import com.leetcode.oj.util.ListNode;

/**
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * 
 * @author rekinyz
 *
 */
public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode p = null, res = null;
		int carry = 0;
		return addTwoNumbers(l1, l2, p, res, carry);
	}

	private ListNode addTwoNumbers(ListNode l1, ListNode l2, ListNode p, ListNode res, int carry) {
		int sum = 0;
		if (l1 != null) {
			sum += l1.val;
			l1 = l1.next;
		}
		if (l2 != null) {
			sum += l2.val;
			l2 = l2.next;
		}
		sum += carry;
		carry = 0;
		if (sum > 9) {
			sum -= 10;
			carry++;
		}
		if (p == null) {
			p = new ListNode(sum);
			res = p;
		} else {
			p.next = new ListNode(sum);
			p = p.next;
		}
		if (l1 != null || l2 != null) {
			addTwoNumbers(l1, l2, p, res, carry);
		} else if (carry != 0) {
			p.next = new ListNode(carry);
		}
		return res;
	}

}
