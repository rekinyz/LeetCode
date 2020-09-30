package com.leetcode.oj;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeNumberTest {

	PalindromeNumber pn = new PalindromeNumber();

	@Test
	public void testIsPalindrome1() {
		int x = 909;
		assertTrue(isPalindrome(x));
	}

	@Test
	public void testIsPalindrome2() {
		int x = 123454321;
		assertTrue(isPalindrome(x));
	}

	@Test
	public void testIsPalindrome3() {
		int x = 90;
		assertFalse(isPalindrome(x));
	}

	@Test
	public void testIsPalindrome4() {
		int x = -2147447412;
		assertFalse(isPalindrome(x));
	}

	@Test
	public void testIsPalindrome5() {
		int x = -1;
		assertFalse(isPalindrome(x));
	}

	@Test
	public void testIsPalindrome6() {
		int x = 0;
		assertTrue(isPalindrome(x));
	}

	@Test
	public void testIsPalindrome7() {
		int x = (1 << 31) - 1;
		assertFalse(isPalindrome(x));
	}

	protected boolean isPalindrome(int x) {
		return pn.isPalindrome(x);
	}

}
