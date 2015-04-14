package com.leetcode.oj;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidParenthesesTest {

	ValidParentheses vp = new ValidParentheses();

	@Test
	public void testIsValid1() {
		String s = "({})[()]{[]}";
		assertTrue(isValid(s));
	}

	@Test
	public void testIsValid2() {
		String s = "([)]";
		assertFalse(isValid(s));
	}
	
	@Test
	public void testIsValid3() {
		String s = "([{}])";
		assertTrue(isValid(s));
	}
	
	@Test
	public void testIsValid4() {
		String s = "([{}]()";
		assertFalse(isValid(s));
	}
	
	@Test
	public void testIsValid5() {
		String s = "[]{}()";
		assertTrue(isValid(s));
	}

	protected boolean isValid(String s) {
		return vp.isValid(s);
	}

}
