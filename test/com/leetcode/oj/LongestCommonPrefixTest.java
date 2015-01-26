package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestCommonPrefixTest {
	
	LongestCommonPrefix lcp = new LongestCommonPrefix();
	
	@Test
	public void testLongestCommonPrefix1(){
		String[] strs = {"abc","abcde","abccde","abcdefg"};
		assertEquals("abc", longestCommonPrefix(strs));
	}
	
	@Test
	public void testLongestCommonPrefix2(){
		String[] strs = {""};
		assertEquals("", longestCommonPrefix(strs));
	}
	
	@Test
	public void testLongestCommonPrefix3(){
		String[] strs = {"prefix","prepare","prio","price","preference"};
		assertEquals("pr", longestCommonPrefix(strs));
	}
	
	@Test
	public void testLongestCommonPrefix4(){
		String[] strs = {"asdf","dfgh","1234","cvb","gjkghj"};
		assertEquals("", longestCommonPrefix(strs));
	}
	
	@Test
	public void testLongestCommonPrefix5(){
		String[] strs = {"asdf","dsbe","sdb1234","asb1cvb","asb1cgjkghj"};
		assertEquals("", longestCommonPrefix(strs));
	}
	
	@Test
	public void testLongestCommonPrefix6(){
		String[] strs = {"aaaa","bbbb","cccc","dddd","eeee"};
		assertEquals("", longestCommonPrefix(strs));
	}
	
	@Test
	public void testLongestCommonPrefix7(){
		String[] strs = {"a","b"};
		assertEquals("", longestCommonPrefix(strs));
	}
	
	private String longestCommonPrefix(String[] strs) {
		return lcp.longestCommonPrefix(strs);
	}
	
}
