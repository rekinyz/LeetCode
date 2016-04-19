package com.leetcode.oj;

/**
 * Implementation of a multiply function without using "*"
 * @author zhy1ism
 *
 */
public class Multiplication {
	public int multiply(final int x, final int y) {
		if (y != 0 && x != 0) {
			if (y > 0) {
				return multiply(x, y - 1) + x;
			} else {
				return multiply(x, y + 1) - x;
			}
		}
		return 0;
	}
}
