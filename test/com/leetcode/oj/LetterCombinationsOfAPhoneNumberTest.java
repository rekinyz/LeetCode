package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class LetterCombinationsOfAPhoneNumberTest {

	LetterCombinationsOfAPhoneNumber lcn = new LetterCombinationsOfAPhoneNumber();

	@Test
	public void testletterCombinations1() {
		String digits = "";
		List<String> expected = Arrays.asList("");
		List<String> result = letterCombinations(digits);
		assertEquals(expected, result);
	}

	@Test
	public void testletterCombinations2() {
		String digits = "2";
		List<String> expected = Arrays.asList("a", "b", "c");
		List<String> result = letterCombinations(digits);
		Collections.sort(result);
		assertEquals(expected, result);
	}

	@Test
	public void testletterCombinations3() {
		String digits = "23";
		List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be",
				"bf", "cd", "ce", "cf");
		List<String> result = letterCombinations(digits);
		Collections.sort(result);
		assertEquals(expected, result);
	}

	@Test
	public void testletterCombinations4() {
		String digits = "234";
		List<String> expected = Arrays.asList("adg", "adh", "adi", "aeg",
				"aeh", "aei", "afg", "afh", "afi", "bdg", "bdh", "bdi", "beg",
				"beh", "bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg",
				"ceh", "cei", "cfg", "cfh", "cfi");
		List<String> result = letterCombinations(digits);
		Collections.sort(result);
		assertEquals(expected, result);
	}

	private List<String> letterCombinations(String digits) {
		return lcn.letterCombinations(digits);
	}

}
