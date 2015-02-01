package com.leetcode.oj;

import java.util.Arrays;

/**
 * 3Sum Closest
 * 
 * Given an array S of n integers, find three integers in S such that the sum is
 * closest to a given number, target. Return the sum of the three integers. You
 * may assume that each input would have exactly one solution.
 * 
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * 
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * 
 * @author rekinyz
 */
public class ThreeSumClosest {

	// O(N²)
	public int threeSumClosest(int[] num, int target) {
		int len = num.length, min = Integer.MAX_VALUE;
		Arrays.sort(num);
		for (int i = 0; i < len - 2; i++) {
			for (int j = i + 1, k = len - 1; j < k;) {
				int diff = num[i] + num[j] + num[k] - target;
				if (Math.abs(diff) < Math.abs(min)) {
					min = diff;
				}
				if (diff < 0) {
					j++;
				} else {
					k--;
				}
			}
		}
		return min + target;
	}

	// O(N³)
	public int threeSumClosest1(int[] num, int target) {
		int len = num.length, min = Integer.MAX_VALUE;
		for (int i = 0; i < len - 2; i++) {
			for (int j = i + 1; j < len - 1; j++) {
				for (int k = j + 1; k < len; k++) {
					int diff = num[i] + num[j] + num[k] - target;
					if (Math.abs(diff) < Math.abs(min)) {
						min = diff;
					}
				}
			}
		}
		return min + target;
	}

}
