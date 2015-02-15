package com.leetcode.oj;

import java.util.List;

import com.leetcode.oj.util.ListNode;

/**
 * Merge k Sorted Lists
 * 
 * Merge k sorted linked lists and return it as one sorted list. Analyze and
 * describe its complexity.
 * 
 * @author rekinyz
 */
public class MergeKSortedLists {

	public ListNode mergeKLists(List<ListNode> lists) {
		if (lists.size() == 0) {
			return null;
		}
		if (lists.size() == 1) {
			return lists.get(0);
		}
		if (lists.size() == 2) {
			return mergeTwoLists(lists.get(0), lists.get(1));
		}
		return mergeTwoLists(mergeKLists(lists.subList(0, lists.size() / 2)),
				mergeKLists(lists.subList(lists.size() / 2, lists.size())));
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}

		ListNode mergeHead;
		if (l1.val < l2.val) {
			mergeHead = l1;
			mergeHead.next = mergeTwoLists(l1.next, l2);
		} else {
			mergeHead = l2;
			mergeHead.next = mergeTwoLists(l1, l2.next);
		}
		return mergeHead;
	}

}
