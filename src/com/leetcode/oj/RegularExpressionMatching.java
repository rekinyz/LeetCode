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
		int sLen = s.length(), pLen = p.length();
		int i=0, j=0;
		if(s.equals(p) || p.equals(".*")){
			return true;
		}
		if(i<sLen && j<pLen){
			if(sLen>0 && pLen>2 && p.contains("*")){
				return isMatch(s, p.substring(2)) || compareChar(s.charAt(i), p.charAt(j)) && isMatch(s.substring(1), p);
			}else if(sLen!=pLen){
				return false;
			}
			return compareChar(s.charAt(i++), p.charAt(j++));
		}
		return false;
	}
	
	private boolean compareChar(char a, char b) {
        return (a==b || b=='.');
    }
	
}
