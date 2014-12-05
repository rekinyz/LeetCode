package com.leetcode.oj;

import java.util.HashMap;
import java.util.Map;

/**
 * 	Single Number II
 * 
 *  Given an array of integers, every element appears three times except for one. Find that single one.
 *  
 *  Note:
 *  Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? 
 * 
 * @author rekinyz
 */
public class SingleNumber2 {

	public int singleNumber(int[] A) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int a : A) {
			Integer value = map.get(a);
			if (value != null) {
				map.put(a, ++value);
			} else {
				map.put(a, 1);
			}
		}
		for (int a : A) {
			Integer value = map.get(a);
			if (value == 1) {
				return a;
			}
		}
		return 0;
	}
	
	public int singleNumber1(int[] A) {
		int ones = 0, twos = 0;
		for(int i = 0; i < A.length; i++){
			ones = (ones ^ A[i]) & ~twos;
			twos = (twos ^ A[i]) & ~ones;
		}
		return ones;
	}
	

}
