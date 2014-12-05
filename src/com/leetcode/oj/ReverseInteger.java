package com.leetcode.oj;

/**
 * Reverse Integer
 * 
 * Reverse digits of an integer.
 * 
 * Example1: x = 123, return 321 Example2: x = -123, return -321
 * 
 * Have you thought about this?
 * 
 * Here are some good questions to ask before coding. Bonus points for you if
 * you have already thought through this!
 * 
 * If the integer's last digit is 0, what should the output be? ie, cases such
 * as 10, 100. Did you notice that the reversed integer might overflow? Assume
 * the input is a 32-bit integer, then the reverse of 1000000003 overflows. How
 * should you handle such cases?
 * 
 * Throw an exception? Good, but what if throwing an exception is not an option?
 * You would then have to re-design the function (ie, add an extra parameter).
 * 
 * @author rekinyz
 */
public class ReverseInteger {

	public int reverse1(int x) {
		String sign = "";
		String s = String.valueOf(x);
		if (x < 0) {
			sign = "-";
			s = s.substring(1);
		}
		int len = s.length();
		StringBuilder sb = new StringBuilder(len + 1);
		sb.append(sign);
		for (int i = len - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}

		Long result = Long.parseLong(sb.toString());

		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			return 0;
		}

		return result.intValue();
	}

	public int reverse(int x) {
		String s = String.valueOf(Math.abs((long) x)); // x>0?x:-(long)x
		int len = s.length();
		StringBuilder sb = new StringBuilder(len);
		for (int i = len - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}

		Long result = (x < 0 ? -1 : 1) * Long.parseLong(sb.toString());

		if (result > 1 << 31 - 1 || result < 1 << 31) {
			return 0;
		}

		return result.intValue();
	}

}
