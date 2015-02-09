package com.leetcode.oj;

/**
 * Implement strStr()
 * 
 * Returns the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 * 
 * @author rekinyz
 */
public class ImplementStrStr {

	public int strStr(String haystack, String needle) {
		int res = needle.isEmpty() ? 0 : haystack.indexOf(needle.charAt(0));
		int i = 0, j = res, nLen = needle.length(), hLen = haystack.length();
		while (res != -1 && i < nLen - 1 && j < hLen - 1 && hLen - res >= nLen) {
			if (haystack.charAt(++j) != needle.charAt(++i)) {
				i = 0;
				res = haystack.indexOf(needle.charAt(i), ++res);
				j = res;
			}
		}
		return hLen - res >= nLen ? res : -1;
	}

}
