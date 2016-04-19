package com.leetcode.oj;

/**
 * Divide Two Integers
 * Divide two integers without using multiplication, division and mod operator.
 * If it is overflow, return MAX_INT.
 * Subscribe to see which companies asked this question
 *
 * @author rekinyz
 */
public class DivideTwoIntegers {
	public int divide(final int dividend, final int divisor) {
		int res = Integer.MAX_VALUE;
		if (divisor != 0) {
			res = (int) div(abs(dividend), abs(divisor));
			if (dividend > 0 ^ divisor > 0) {
				res = 0 - res;
			}
		}
		return res;
	}

	private long div(long x, final long y) {
		long total = 0;
		while(x >= y ){
			x -= y;
			total++;
		}
		return total;
	}

	private long abs(final long x) {
		return x < 0 ? 0 - x : x;
	}
}
