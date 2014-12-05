package com.leetcode.oj;

/**
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order. You may assume no duplicates in the array. Here are few examples.
 * 
 * [1,3,5,6], 5 → 2 [1,3,5,6], 2 → 1 [1,3,5,6], 7 → 4 [1,3,5,6], 0 → 0
 * 
 * @author rekinyz
 */
public class SearchInsertPosition {

	// O(logN)
	public int searchInsert(int[] A, int target) {
		return searchInsert(A, target, 0, A.length);
	}

	private int searchInsert(int[] A, int target, int start, int end) {
		int M = (start + end) / 2;
		if (target <= A[start]) {
			return start;
		} else if (target > A[end - 1]) {
			return end;
		} else if (target <= A[M]) {
			return searchInsert(A, target, start, M);
		} else {
			return searchInsert(A, target, M, end);
		}
	}

	// O(N)
	public int searchInsert1(int[] A, int target) {
		int len = A.length;
		int i = 0;
		for (; i < len; i++) {
			if (target <= A[i]) {
				return i;
			}
		}
		return i;
	}

}
