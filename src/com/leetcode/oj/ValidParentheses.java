package com.leetcode.oj;

import java.util.HashMap;
import java.util.LinkedList;
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
		for (char ca : s.toCharArray()) {
			Character c = Character.valueOf(ca);
			if (stack.isEmpty() || !c.equals(pair.get(stack.peek()))) {
				stack.push(c);
			} else {
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

	public boolean isValid1(String s) {
		LinkedList<Character> stack = new LinkedList<Character>();
		for (char ca : s.toCharArray()) {
			Character c = Character.valueOf(ca);
			if (stack.isEmpty() || !c.equals(pair.get(stack.getLast()))) {
				stack.addLast(c);
			} else {
				stack.removeLast();
			}
		}
		return stack.isEmpty();
	}

}
