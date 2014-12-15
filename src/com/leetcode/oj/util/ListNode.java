package com.leetcode.oj.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * 
 * @author rekinyz
 */
public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
		next = null;
	}

	public static ListNode convert(int[] array) {
		if (array.length == 0) {
			return null;
		}
		ListNode head = new ListNode(array[0]);
		ListNode list = head;
		for (int i = 1; i < array.length; i++, head = head.next) {
			head.next = new ListNode(array[i]);
		}
		return list;
	}

	public static ListNode cycle(int[] array, int n) {
		ListNode head = new ListNode(array[0]);
		ListNode list = head;
		for (int i = 1; i < array.length; i++, head = head.next) {
			head.next = new ListNode(array[i]);
		}
		if (head.next == null) {
			ListNode newHead = list;
			for (; n > 1; n--) {
				newHead = newHead.next;
			}
			head.next = newHead;
		}
		return list;
	}

	public List<Integer> toList() {
		List<Integer> list = new ArrayList<Integer>();
		ListNode current = this;
		while (current != null) {
			list.add(current.val);
			current = current.next;
		}
		return list;
	}

	@Override
	public String toString() {
		String result = "";
		ListNode current = this;
		while (current != null) {
			result += current.val + ", ";
			current = current.next;
		}
		return result.substring(0, result.length() - 2);
	}

	public static void main(String[] s) {
		int[] input0 = { 0, 1, 1, 2, 2, 3, 3 };
		int[] input1 = { 0, 0 };
		System.out.println(convert(input0));
		System.out.println(convert(input1));

	}
}
