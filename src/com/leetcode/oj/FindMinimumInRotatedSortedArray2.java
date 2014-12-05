package com.leetcode.oj;

/**
 * Find Minimum in Rotated Sorted Array II
 * 
 * Follow up for "Find Minimum in Rotated Sorted Array": What if duplicates are
 * allowed? Would this affect the run-time complexity? How and why?
 * 
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2). Find the minimum element.
 * The array may contain duplicates.
 * 
 * @author rekinyz
 */
public class FindMinimumInRotatedSortedArray2 {

	// O(N)
	public int findMin(int[] num) {
		int pivot = num[0];
		for (int n : num) {
			while (pivot <= n) {
				if (pivot == n) {
					break;
				}
				pivot = n;
			}
			if (pivot > n) {
				return n;
			}
		}
		return num[0];
	}

	// O(logN)
	public int findMin1(int[] num) {

		if (num.length == 0)
			return 0;
		if (num.length == 1)
			return num[0];

		int l = 0, r = num.length - 1, mid;

		while (true) {
			mid = (r + l) / 2; // binary-search
			if (mid == l)
				break; // range reduced to only 2 elements

			if (num[mid] > num[r]) {
				l = mid;
			} else if (num[mid] < num[l]) {
				r = mid;
			} else {
				return num[l];
			}
		}

		return num[l] < num[r] ? num[l] : num[r];
	}

}
