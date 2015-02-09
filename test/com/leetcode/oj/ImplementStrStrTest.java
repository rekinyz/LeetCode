package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ImplementStrStrTest {

	ImplementStrStr iss = new ImplementStrStr();

	@Test
	public void testStrStr1() {
		String haystack = "abcdefghijklmnopqrstuvwxyz";
		String needle = "ijk";
		assertEquals(8, strStr(haystack, needle));
	}

	@Test
	public void testStrStr2() {
		String haystack = "abcdefghijklmnopqrstuvwxyz";
		String needle = "abc";
		assertEquals(0, strStr(haystack, needle));
	}
	
	@Test
	public void testStrStr3() {
		String haystack = "abcdefghijklmnopqrstuvwxyz";
		String needle = "stuvwxyz";
		assertEquals(18, strStr(haystack, needle));
	}
	
	@Test
	public void testStrStr4() {
		String haystack = "abcdefgh";
		String needle = "ijk";
		assertEquals(-1, strStr(haystack, needle));
	}

	@Test
	public void testStrStr5() {
		String haystack = "defghijkabclmnopqrstuabcvwxyz";
		String needle = "abc";
		assertEquals(8, strStr(haystack, needle));
	}
	
	@Test
	public void testStrStr6() {
		String haystack = "adsf";
		String needle = "";
		assertEquals(0, strStr(haystack, needle));
	}
	
	@Test
	public void testStrStr7() {
		String haystack = "";
		String needle = "";
		assertEquals(0, strStr(haystack, needle));
	}
	
	@Test
	public void testStrStr8() {
		String haystack = "";
		String needle = "a";
		assertEquals(-1, strStr(haystack, needle));
	}
	
	@Test
	public void testStrStr9() {
		String haystack = "aaa";
		String needle = "aaaa";
		assertEquals(-1, strStr(haystack, needle));
	}
	
	@Test
	public void testStrStr10() {
		String haystack = "aaa";
		String needle = "aaa";
		assertEquals(0, strStr(haystack, needle));
	}
	
	@Test
	public void testStrStr11() {
		String haystack = "mississippi";
		String needle = "mississippi";
		assertEquals(0, strStr(haystack, needle));
	}
	
	@Test
	public void testStrStr12() {
		String haystack = "aaabbcabbcaaa";
		String needle = "aaabbcabbc";
		assertEquals(0, strStr(haystack, needle));
	}
	
	@Test
	public void testStrStr13() {
		String haystack = "mississippi";
		String needle = "sippia";
		assertEquals(-1, strStr(haystack, needle));
	}
	
	@Test
	public void testStrStr14() {
		String haystack = "mississippi";
		String needle = "issip";
		assertEquals(4, strStr(haystack, needle));
	}
	
	@Test
	public void testStrStr15() {
		String haystack = "aaabb";
		String needle = "baba";
		assertEquals(-1, strStr(haystack, needle));
	}
	
	@Test
	public void testStrStr16() {
		String haystack = "babba";
		String needle = "bbb";
		assertEquals(-1, strStr(haystack, needle));
	}
	
	@Test
	public void testStrStr17() {
		String haystack = "a";
		String needle = "a";
		assertEquals(0, strStr(haystack, needle));
	}
	
	private int strStr(String haystack, String needle) {
		return iss.strStr(haystack, needle);
	}
	
}
