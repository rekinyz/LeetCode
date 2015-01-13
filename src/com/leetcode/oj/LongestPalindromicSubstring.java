package com.leetcode.oj;

/**
 * Longest Palindromic Substring
 * 
 * Given a string S, find the longest palindromic substring in S. You may assume
 * that the maximum length of S is 1000, and there exists one unique longest
 * palindromic substring.
 * 
 * @author rekinyz
 */
public class LongestPalindromicSubstring {

    /** O(N) Manacher Algorithm */
    public String longestPalindrome(String s) {
        // preprocess string
        char[] str = preProcess(s).toCharArray();
        int N = str.length;
        int[] p = new int[N + 1];
        int id = 0, mx = 0;
        for (int i = 1; i < N - 1; i++) {
            p[i] = mx > i ? Math.min(p[2 * id - i], mx - i) : 0;
            while (str[i + 1 + p[i]] == str[i - 1 - p[i]])
                p[i]++;
            if (i + p[i] > mx) {
                mx = i + p[i];
                id = i;
            }
        }

        // length of largest palindrome
        int maxLen = 0;

        // position of center of largest palindrome
        int centerIndex = 0;
        for (int i = 1; i < N - 1; i++) {
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }

        // starting index of palindrome
        int pos = (centerIndex - 1 - maxLen) / 2;
        return s.substring(pos, pos + maxLen);
    }

    private String preProcess(String s) {
        int len = s.length();
        if (len == 0)
            return "^$";
        String str = "^";
        for (int i = 0; i < len; i++)
            str += "#" + s.charAt(i);
        str += "#$";
        return str;
    }

	// O(N²)
	public String longestPalindrome1(String s) {
		int len = s.length();
		int endIdx = 0;
		int longest = 0;
		for (int i = 0; i < len; i++) {
			if (isPalindrome(s, i - longest, i)) {
				longest++;
				endIdx = i;
			} else if (i - longest - 1 >= 0
					&& isPalindrome(s, i - longest - 1, i)) {
				longest += 2;
				endIdx = i;
			}
		}
		return s.substring(endIdx + 1 - longest, endIdx + 1);
	}

	// O(N³)
	public String longestPalindrome2(String s) {
		int len = s.length();
		int longest = 0;
		String res = "";
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				if (isPalindrome(s, i, j) && longest < j - i + 1) {
					longest = j - i + 1;
					res = s.substring(i, j + 1);
				}
			}
		}
		return res;
	}

	private boolean isPalindrome(String s, int startIdx, int endIdx) {
		for (int head = startIdx; head < endIdx; head++, endIdx--) {
			if (s.charAt(head) != s.charAt(endIdx)) {
				return false;
			}
		}
		return true;
	}

}
