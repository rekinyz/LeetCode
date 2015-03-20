package com.leetcode.oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 3Sum
 * 
 * Given an array S of n integers, are there elements a, b, c in S such that a +
 * b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * 
 * Note: Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤
 * b ≤ c) The solution set must not contain duplicate triplets.
 * 
 * For example, given array S = {-1, 0, 1, 2, -1, -4}, A solution set is: (-1,
 * 0, 1) (-1, -1, 2)
 * 
 * @author rekinyz
 */
public class ThreeSum {

	// O(N²) the fastest one, removed the duplicates without using Set
	public List<List<Integer>> threeSum(int[] num) {
		int len = num.length;
		Arrays.sort(num);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for (int i = 0; i < len - 2; i++) {
			if (i == 0 || (i > 0 && num[i] != num[i - 1])) {
				for (int j = i + 1, k = len - 1; j < k;) {
					if (num[i] + num[j] + num[k] < 0) {
						j++;
					} else if (num[i] + num[j] + num[k] > 0) {
						k--;
					} else {
						res.add(Arrays.asList(num[i], num[j], num[k]));
						while (j < k && num[j] == num[j + 1])
							j++;
						while (j < k && num[k] == num[k - 1])
							k--;
						j++;
						k--;
					}
				}
			}
		}
		return res;
	}
	
	// O(N²) faster than former one!
	public List<List<Integer>> threeSum1(int[] num) {
		int len = num.length;
		Arrays.sort(num);
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		for (int i = 0; i < len - 2; i++) {
			for (int j = i + 1, k = len - 1; j < k;) {
				if (num[i] + num[j] + num[k] < 0) {
					j++;
				} else if (num[i] + num[j] + num[k] > 0) {
					k--;
				} else {
					set.add(Arrays.asList(num[i], num[j], num[k]));
					j++;
					k--;
				}
			}
		}
		return new ArrayList<List<Integer>>(set);
	}

	// O(N²) performance still not good enough
	public List<List<Integer>> threeSum2(int[] num) {
		int len = num.length;
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(len);
		for (int i = 0; i < len; i++) {
			map.put(num[i], i);
		}
		for (int i = 0; i < len - 2; i++) {
			for (int j = i + 1; j < len - 1; j++) {
				if (map.containsKey(0 - num[i] - num[j])) {
					int k = map.get(0 - num[i] - num[j]);
					if (k != i && k != j) {
						List<Integer> l = Arrays.asList(num[i], num[j], num[k]);
						Collections.sort(l);
						set.add(l);
					}
				}
			}
		}
		return new ArrayList<List<Integer>>(set);
	}

	// O(N²logN)
	public List<List<Integer>> threeSum3(int[] num) {
		int len = num.length;
		Arrays.sort(num);
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		for (int i = 0; i < len - 2; i++) {
			for (int j = i + 1; j < len - 1; j++) {
				int k = Arrays.binarySearch(num, 0 - num[i] - num[j]);
				if (k > 0 && k != i && k != j) {
					List<Integer> l = Arrays.asList(num[i], num[j], num[k]);
					Collections.sort(l);
					set.add(l);
				}
			}
		}
		return new ArrayList<List<Integer>>(set);
	}

	// O(N³)
	public List<List<Integer>> threeSum4(int[] num) {
		int len = num.length;
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		for (int i = 0; i < len - 2; i++) {
			for (int j = i + 1; j < len - 1; j++) {
				for (int k = j + 1; k < len; k++) {
					if (num[i] + num[j] + num[k] == 0) {
						List<Integer> l = Arrays.asList(num[i], num[j], num[k]);
						Collections.sort(l);
						set.add(l);
					}
				}
			}
		}
		return new ArrayList<List<Integer>>(set);
	}

}
