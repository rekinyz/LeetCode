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
		int hLen = haystack.length(), nLen = needle.length();
		for (int i = 0; i <= hLen - nLen; i++) {
			int j = 0;
			for (; j < nLen; j++) {
				if (needle.charAt(j) != haystack.charAt(i + j))
					break;
			}
			if (j == nLen)
				return i;
		}
		return -1;
	}

}
