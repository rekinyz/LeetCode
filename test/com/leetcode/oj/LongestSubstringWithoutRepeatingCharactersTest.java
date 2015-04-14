package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

	LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();

	@Test
	public void testLengthOfLongestSubstring1() {
		String s = "";
		assertEquals(0, lengthOfLongestSubstring(s));
	}

	@Test
	public void testLengthOfLongestSubstring2() {
		String s = "abcabcbb"; // abc
		assertEquals(3, lengthOfLongestSubstring(s));
	}

	@Test
	public void testLengthOfLongestSubstring3() {
		String s = "bbbbb"; // b
		assertEquals(1, lengthOfLongestSubstring(s));
	}

	@Test
	public void testLengthOfLongestSubstring4() {
		String s = "abbabb"; // ab
		assertEquals(2, lengthOfLongestSubstring(s));
	}

	@Test
	public void testLengthOfLongestSubstring5() {
		String s = "abcadcb"; // adcb
		assertEquals(4, lengthOfLongestSubstring(s));
	}

	@Test
	public void testLengthOfLongestSubstring6() {
		String s = "abcdabcdefgdefg"; // abcdefg
		assertEquals(7, lengthOfLongestSubstring(s));
	}

	@Test
	public void testLengthOfLongestSubstring7() {
		String s = "wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco"; // mqbhcdarzowk
		assertEquals(12, lengthOfLongestSubstring(s));
	}
	
	protected int lengthOfLongestSubstring(String s){
		return lswrc.lengthOfLongestSubstring(s);
	}

}
