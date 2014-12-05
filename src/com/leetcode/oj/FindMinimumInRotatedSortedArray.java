package com.leetcode.oj;

/**
 * Find Minimum in Rotated Sorted Array
 * 
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 * Find the minimum element.
 * 
 * You may assume no duplicate exists in the array.
 * 
 * @author rekinyz
 */
public class FindMinimumInRotatedSortedArray {

	// O(logN)
	public int findMin(int[] num) {
		return findMin(num, 0, num.length);
	}

	private int findMin(int[] num, int start, int end) {
		int mid = (start + end) / 2;
		int S = num[start];
		int M = num[mid];
		int E = num[end - 1];
		if (S <= E) {
			return S;
		} else if (M == E) {
			return M;
		} else if (M < E) {
			return Math.min(M, findMin(num, start, mid));
		} else {
			return findMin(num, mid, end);
		}
	}

	// O(N)
	public int findMin1(int[] num) {
		int pivot = num[0];
		for (int n : num) {
			while (pivot < n) {
				pivot = n;
			}
			if (pivot > n) {
				return n;
			}
		}
		return num[0];
	}

}
