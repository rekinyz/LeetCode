package com.leetcode.oj;

/**
 * Longest Substring Without Repeating Characters
 * 
 * Given a string, find the length of the longest substring without repeating
 * characters. For example, the longest substring without repeating letters for
 * "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring
 * is "b", with the length of 1.
 * 
 * @author rekinyz
 *
 */
public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
		int len = s.length();
		String longest = "";
		int max = 0;
		for (int i = 0; i < len; i++) {
			int index = longest.indexOf(s.charAt(i));
			if (index != -1) {
				longest = longest.substring(index + 1, longest.length());
			}
			longest += s.charAt(i);
			max = Math.max(max, longest.length());
		}
		return max;
	}

}
