package com.leetcode.oj;

/**
 * Longest Palindromic Substring
 * 
 * Given a string S, find the longest palindromic substring in S. You may assume
 * that the maximum length of S is 1000, and there exists one unique longest
 * palindromic substring.
 * 
 * @author rekinyz
 */
public class LongestPalindromicSubstring {

	// O(N²)
	public String longestPalindrome(String s) {
		int len = s.length();
		int endIdx = 0;
		int longest = 0;
		for (int i = 0; i < len; i++) {
			if (isPalindrome(s, i - longest, i)) {
				longest++;
				endIdx = i;
			} else if (i - longest - 1 >= 0
					&& isPalindrome(s, i - longest - 1, i)) {
				longest += 2;
				endIdx = i;
			}
		}
		return s.substring(endIdx + 1 - longest, endIdx + 1);
	}

	// O(N³)
	public String longestPalindrome1(String s) {
		int len = s.length();
		int longest = 0;
		String res = "";
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				if (isPalindrome(s, i, j) && longest < j - i + 1) {
					longest = j - i + 1;
					res = s.substring(i, j + 1);
				}
			}
		}
		return res;
	}

	private boolean isPalindrome(String s, int startIdx, int endIdx) {
		for (int head = startIdx; head < endIdx; head++, endIdx--) {
			if (s.charAt(head) != s.charAt(endIdx)) {
				return false;
			}
		}
		return true;
	}

}
