package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

	LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();

	@Test
	public void testLengthOfLongestSubstring1() {
		String s = "";
		assertEquals(lswrc.lengthOfLongestSubstring(s), 0);
	}

	@Test
	public void testLengthOfLongestSubstring2() {
		String s = "abcabcbb"; // abc
		assertEquals(lswrc.lengthOfLongestSubstring(s), 3);
	}

	@Test
	public void testLengthOfLongestSubstring3() {
		String s = "bbbbb"; // b
		assertEquals(lswrc.lengthOfLongestSubstring(s), 1);
	}

	@Test
	public void testLengthOfLongestSubstring4() {
		String s = "abbabb"; // ab
		assertEquals(lswrc.lengthOfLongestSubstring(s), 2);
	}

	@Test
	public void testLengthOfLongestSubstring5() {
		String s = "abcadcb"; // adcb
		assertEquals(lswrc.lengthOfLongestSubstring(s), 4);
	}

	@Test
	public void testLengthOfLongestSubstring6() {
		String s = "abcdabcdefgdefg"; // abcdefg
		assertEquals(lswrc.lengthOfLongestSubstring(s), 7);
	}

	@Test
	public void testLengthOfLongestSubstring7() {
		String s = "wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco"; // mqbhcdarzowk
		assertEquals(lswrc.lengthOfLongestSubstring(s), 12);
	}

}
