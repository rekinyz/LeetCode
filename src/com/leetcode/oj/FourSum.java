package com.leetcode.oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 4Sum Given an array S of n integers, are there elements a, b, c, and d in S
 * such that a + b + c + d = target? Find all unique quadruplets in the array
 * which gives the sum of target.
 * 
 * Note:
 * 
 * Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤
 * b ≤ c ≤ d) The solution set must not contain duplicate quadruplets.
 * 
 * For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
 * 
 * A solution set is: (-1, 0, 0, 1) (-2, -1, 1, 2) (-2, 0, 0, 2)
 * 
 * @author rekinyz
 */
public class FourSum {

	public List<List<Integer>> fourSum(int[] num, int target) {
		int len = num.length;
		Arrays.sort(num);
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		for (int l = 0; l < len - 3; l++) {
			for (int i = l + 1; i < len - 2; i++) {
				for (int j = i + 1, k = len - 1; j < k;) {
					if (num[l] + num[i] + num[j] + num[k] < target) {
						j++;
					} else if (num[l] + num[i] + num[j] + num[k] > target) {
						k--;
					} else {
						set.add(Arrays.asList(num[l], num[i], num[j], num[k]));
						j++;
						k--;
					}
				}
			}
		}
		return new ArrayList<List<Integer>>(set);
	}

}
