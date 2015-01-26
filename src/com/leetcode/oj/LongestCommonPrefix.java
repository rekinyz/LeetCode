package com.leetcode.oj;

/**
 * Longest Common Prefix
 * 
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 * @author rekinyz
 */
public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		String pre = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (!strs[i].startsWith(pre))
				pre = pre.substring(0, pre.length() - 1);
		}
		return pre;
	}

}
