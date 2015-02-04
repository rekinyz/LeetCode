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
		int i = 0;
		int res = needle.isEmpty() ? 0 : haystack.indexOf(needle.charAt(i));
		int j = res, nLen = needle.length();
		while (i < nLen - 1) {
			if (haystack.indexOf(needle.charAt(++i)) != ++j) {
				res = haystack.indexOf(needle.charAt(i));
				j = res;
			}
		}
		return nLen <= haystack.length() ? res : -1;
	}
	
}
