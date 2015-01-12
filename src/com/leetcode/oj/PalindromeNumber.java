package com.leetcode.oj;

/**
 * Palindrome Number
 * 
 * Determine whether an integer is a palindrome. Do this without extra space.
 * 
 * Some hints:
 * 
 * Could negative integers be palindromes? (ie, -1)
 * 
 * If you are thinking of converting the integer to string, note the restriction
 * of using extra space.
 * 
 * You could also try reversing an integer. However, if you have solved the
 * problem "Reverse Integer", you know that the reversed integer might overflow.
 * How would you handle such case?
 * 
 * There is a more generic way of solving this problem.
 * 
 * @author rekinyz
 */
public class PalindromeNumber {

	public boolean isPalindrome(int x) {
		long reverse = 0;
		int tmp = x;
		while (tmp != 0) {
			reverse *= 10;
			reverse += tmp % 10;
			tmp /= 10;
		}
		return reverse == Math.abs(x);
	}

	// extra space used
	public boolean isPalindrome1(int x) {
		if (x >= 0) {
			String s = Integer.toString(x);
			int tail = s.length() - 1;
			for (int head = 0; head < tail; head++, tail--) {
				if (s.charAt(head) != s.charAt(tail)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

}
