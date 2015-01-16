package com.leetcode.oj;

/**
 * Regular Expression Matching
 * 
 * Implement regular expression matching with support for '.' and '*'.
 * 
 * '.' Matches any single character. 
 * '*' Matches zero or more of the preceding element.
 * 
 * The matching should cover the entire input string (not partial).
 * 
 * Some examples: 
 * isMatch("aa","a") → false 
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false 
 * isMatch("aa", "a*") → true 
 * isMatch("aa", ".*") → true 
 * isMatch("ab", ".*") → true 
 * isMatch("aab", "c*a*b") → true
 * 
 * @author rekinyz
 */
public class RegularExpressionMatching {

	public boolean isMatch(String s, String p) {
		if (p.contains(".") || p.contains("*")) {
			if (p.length() == 1 || p.charAt(1) != '*')
				return comp(s, p, s.length(), 0) && isMatch(s.substring(1), p.substring(1));
			for (int i = 0; i == 0 || comp(s, p, s.length(), i - 1); i++) {
				if (isMatch(s.substring(i), p.substring(2)))
					return true;
			}
		}
		return s.equals(p);
	}

	private boolean comp(String s, String p, int sLen, int i) {
		return sLen > i && (p.charAt(0) == s.charAt(i) || p.charAt(0) == '.');
	}

}
