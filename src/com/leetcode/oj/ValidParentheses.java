package com.leetcode.oj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Valid Parentheses
 * 
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid
 * but "(]" and "([)]" are not.
 * 
 * @author rekinyz
 */
public class ValidParentheses {

	private static final Map<Character, Character> pair = new HashMap<Character, Character>(3);
	static {
		pair.put('(', ')');
		pair.put('[', ']');
		pair.put('{', '}');
	}

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			Character c = Character.valueOf(s.charAt(i));
			if (stack.isEmpty() || !c.equals(pair.get(stack.peek()))) {
				stack.push(c);
			} else {
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

}
