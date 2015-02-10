package com.leetcode.oj;

/**
 * Factorial Trailing Zeroes
 * 
 * Given an integer n, return the n of trailing zeroes in n!.
 * 
 * Note: Your solution should be in logarithmic time complexity.
 * 
 * @author z001raxe
 */
public class FactorialTrailingZeroes {

	public int trailingZeroes(int n) {
		return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
	}

	public int trailingZeroes1(int n) {
		int res = 0;
		while (n > 1) {
			n /= 5;
			res += n;
		}
		return res;
	}

}
