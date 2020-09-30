package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class GenerateParenthesesTest {

	GenerateParentheses gp = new GenerateParentheses();

	@Test
	public void testGenerateParentheses1() {
		List<String> expected = Arrays.asList("");
		Collections.sort(expected);
		int n = -1;
		List<String> result = generateParenthesis(n);
		Collections.sort(result);
		assertEquals(expected, result);
	}

	@Test
	public void testGenerateParentheses2() {
		List<String> expected = Arrays.asList("()");
		Collections.sort(expected);
		int n = 1;
		List<String> result = generateParenthesis(n);
		Collections.sort(result);
		assertEquals(expected, result);
	}

	@Test
	public void testGenerateParentheses3() {
		List<String> expected = Arrays.asList("()()", "(())");
		Collections.sort(expected);
		int n = 2;
		List<String> result = generateParenthesis(n);
		Collections.sort(result);
		assertEquals(expected, result);
	}

	@Test
	public void testGenerateParentheses4() {
		List<String> expected = Arrays.asList("((()))", "(()())", "(())()",
				"()(())", "()()()");
		Collections.sort(expected);
		int n = 3;
		List<String> result = generateParenthesis(n);
		Collections.sort(result);
		assertEquals(expected, result);
	}

	@Test
	public void testGenerateParentheses5() {
		List<String> expected = Arrays.asList("(())(())", "((()))()",
				"()(()())", "()(())()", "()()()()", "(((())))", "((()()))",
				"()()(())", "()((()))", "(()()())", "(()())()", "((())())",
				"(())()()", "(()(()))");
		Collections.sort(expected);
		int n = 4;
		List<String> result = generateParenthesis(n);
		Collections.sort(result);
		assertEquals(expected, result);
	}

	protected List<String> generateParenthesis(int n) {
		return gp.generateParenthesis(n);
	}
}
