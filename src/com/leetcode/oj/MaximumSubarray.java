package com.leetcode.oj;

/**
 * Maximum Subarray
 * 
 * Find the contiguous subarray within an array (containing at least one number)
 * which has the largest sum. For example, given the array
 * [−2,1,−3,4,−1,2,1,−5,4], the contiguous subarray [4,−1,2,1] has the largest
 * sum = 6.
 * 
 * click to show more practice. More practice:
 * 
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 * 
 * @author rekinyz
 *
 */
public class MaximumSubarray {

	// O(N)
	public int maxSubArray(int[] A) {
		int len = A.length;
		int max = A[0], sum = 0;
		for (int i = 0; i < len; i++) {
			sum += A[i];
			if (sum < A[i]) {
				sum = A[i];
			}
			max = Math.max(max, sum);
		}
		return max;
	}

	// O(N²)
	public int maxSubArray1(int[] A) {
		int max = A[0], tmp;
		for (int i = 0; i < A.length; i++) {
			tmp = A[i];
			for (int j = i + 1; j < A.length; j++) {
				tmp += A[j];
				max = Math.max(max, tmp);
			}
			max = Math.max(max, A[i]);
		}
		return max;
	}
}
