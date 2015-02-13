package com.leetcode.oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Generate Parentheses
 * 
 * Given n pairs of parentheses, write a function to generate all combinations
 * of well-formed parentheses.
 * 
 * For example, given n = 3, a solution set is:
 * 
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 * 
 * @author rekinyz
 */
public class GenerateParentheses {

	public List<String> generateParenthesis(int n) {
		if (n < 1) {
			return Arrays.asList("");
		} else if (n == 1) {
			return Arrays.asList("()");
		} else {
			Set<String> set = new HashSet<>(n * 2);
			for (String s : generateParenthesis(n - 1)) {
				char[] ca = s.toCharArray();
				int len = s.length();
				for (int i = 0, j = len; i < len; i++, j--) {
					set.add(String.copyValueOf(ca, 0, i) + "()"
							+ String.copyValueOf(ca, i, j));
				}
			}
			return new ArrayList<String>(set);
		}
	}

}
