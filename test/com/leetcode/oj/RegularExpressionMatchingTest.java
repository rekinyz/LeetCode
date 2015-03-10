package com.leetcode.oj;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RegularExpressionMatchingTest {

	RegularExpressionMatching rem = new RegularExpressionMatching();

	@Test
	public void testIsMatch1() {
		String s = "aa";
		String p = "a";
		assertFalse(isMatch(s, p));
	}

	@Test
	public void testIsMatch2() {
		String s = "aa";
		String p = "aa";
		assertTrue(isMatch(s, p));
	}
	
	@Test
	public void testIsMatch3() {
		String s = "aaa";
		String p = "aa";
		assertFalse(isMatch(s, p));
	}
	
	@Test
	public void testIsMatch4() {
		String s = "aa";
		String p = "a*";
		assertTrue(isMatch(s, p));
	}
	
	@Test
	public void testIsMatch5() {
		String s = "aa";
		String p = ".*";
		assertTrue(isMatch(s, p));
	}
	
	@Test
	public void testIsMatch6() {
		String s = "ab";
		String p = ".*";
		assertTrue(isMatch(s, p));
	}
	
	@Test
	public void testIsMatch7() {
		String s = "aab";
		String p = "c*a*b";
		assertTrue(isMatch(s, p));
	}
	
	@Test
	public void testIsMatch8() {
		String s = "aabb";
		String p = "aa.*";
		assertTrue(isMatch(s, p));
	}
	
	@Test
	public void testIsMatch9() {
		String s = "aabb";
		String p = ".*ab*";
		assertTrue(isMatch(s, p));
	}
	
	@Test
	public void testIsMatch10() {
		String s = "";
		String p = ".";
		assertFalse(isMatch(s, p));
	}
	
	@Test
	public void testIsMatch11() {
		String s = "a";
		String p = ".";
		assertTrue(isMatch(s, p));
	}
	
	@Test
	public void testIsMatch12() {
		String s = "aa";
		String p = ".";
		assertFalse(isMatch(s, p));
	}
	
	@Test
	public void testIsMatch13() {
		String s = "ab";
		String p = "a.";
		assertTrue(isMatch(s, p));
	}
	
	@Test
	public void testIsMatch14() {
		String s = "aaaccdde";
		String p = "a*ccd*.";
		assertTrue(isMatch(s, p));
	}
	
	@Test
	public void testIsMatch15() {
		String s = "aa";
		String p = "a.";
		assertTrue(isMatch(s, p));
	}
	
	@Test
	public void testIsMatch16() {
		String s = "aaa";
		String p = "ab*a";
		assertFalse(isMatch(s, p));
	}
	
	@Test
	public void testIsMatch17() {
		String s = "ab";
		String p = ".*c";
		assertFalse(isMatch(s, p));
	}
	
	@Test
	public void testIsMatch18() {
		String s = "aaa";
		String p = "ab*ac*a";
		assertTrue(isMatch(s, p));
	}
	
	@Test
	public void testIsMatch19() {
		String s = "aaa";
		String p = ".*";
		assertTrue(isMatch(s, p));
	}
	
	@Test
	public void testIsMatch20() {
		String s = "";
		String p = "b*";
		assertTrue(isMatch(s, p));
	}
	
	protected boolean isMatch(String s, String p) {
		return rem.isMatch(s, p);
	}
}
