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
			res = (int) div(dividend, divisor, 0);
			if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
				res = 0 - res;
			}
		}
		return res;
	}

	private long div(final long x, final long y, final long total) {
		return abs(x) < abs(y) ? total : div(abs(x) - abs(y), y, total + 1);
	}

	private long abs(final long x) {
		return x < 0 ? 0 - x : x;
	}
}
