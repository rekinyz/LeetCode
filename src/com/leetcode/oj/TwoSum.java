package com.leetcode.oj;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find two numbers such that they add up to a
 * specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note that
 * your returned answers (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution. Input:
 * numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 * 
 * @author rekinyz
 *
 */
public class TwoSum {

	public int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		int len = numbers.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < len; i++) {
			map.put(numbers[i], i);
		}
		for (int i = 0; i < len; i++) {
			if (map.get(target - numbers[i]) != null
					&& map.get(target - numbers[i]) != i) {
				result[0] = i + 1;
				result[1] = map.get(target - numbers[i]) + 1;
				return result;
			}
		}
		return result;
	}

}
