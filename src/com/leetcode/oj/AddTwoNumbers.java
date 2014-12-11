package com.leetcode.oj;

import com.leetcode.oj.util.ListNode;

/**
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * 
 * @author z001raxe
 *
 */
public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode p = null;
		ListNode res = null;
		int tmp = 0;
		int sum = 0;
		if (l1 != null && l2 != null) {
			sum = l1.val + l2.val + tmp;
			if (sum >= 10) {
				sum -= 10;
				tmp++;
			}
			p = new ListNode(sum);
			res = p;
			l2 = l2.next;
			l1 = l1.next;
		}
		while (l1 != null || l2 != null) {
			if (l1 == null) {
				sum = l2.val + tmp;
				tmp=0;
				if (sum >= 10) {
					sum-=10;
					tmp++;
				}
				l2 = l2.next;
			} else if (l2 == null) {
				sum = l1.val + tmp;
				tmp=0;
				if (sum >= 10) {
					sum-=10;
					tmp++;
				}
				l1 = l1.next;
			} else {
				sum = l1.val + l2.val + tmp;
				tmp=0;
				if (sum >= 10) {
					sum-=10;
					tmp++;
				}
				l2 = l2.next;
				l1 = l1.next;
			}
			p.next = new ListNode(sum);
			p = p.next;
		}
		if(l1 == null && l2 == null & tmp!=0){
			p.next = new ListNode(tmp);
		}
		return res;
	}

}
