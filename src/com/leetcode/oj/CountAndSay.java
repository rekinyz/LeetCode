package com.leetcode.oj;

/**
 * Count and Say The count-and-say sequence is the sequence of integers
 * beginning as follows: 1, 11, 21, 1211, 111221, ...
 * 
 * 1 is read off as "one 1" or 11. 11 is read off as "two 1s" or 21. 21 is read
 * off as "one 2, then one 1" or 1211.
 * 
 * Given an integer n, generate the nth sequence.
 * 
 * Note: The sequence of integers will be represented as a string.
 * 
 * @author rekinyz
 *
 */
public class CountAndSay {

	public String countAndSay(int n) {
		String res = "";
		if (n == 1) {
			return "1";
		}
		String previous = countAndSay(n - 1);
		int count = 0;
		char p = previous.charAt(0);
		for (int i = 0; i < previous.length(); i++) {
			if (previous.charAt(i) == p) {
				count++;
			} else {
				res += count + "" + p;
				p = previous.charAt(i);
				count = 1;
			}
		}
		res += count + "" + p;
		return res;
	}

}
