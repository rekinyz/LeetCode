package com.leetcode.oj;

/**
 * Longest Substring Without Repeating Characters
 * 
 * Given a string, find the length of the longest substring without repeating
 * characters. For example, the longest substring without repeating letters for
 * "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring
 * is "b", with the length of 1.
 * 
 * @author rekinyz
 *
 */
public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
		int len = s.length();
		String longest = "";
		int max = 0;
		for (int i = 0; i < len; i++) {
			int index = longest.indexOf(s.charAt(i));
			if (index != -1) {
				longest = longest.substring(index + 1, longest.length());
			}
			longest += s.charAt(i);
			max = Math.max(max, longest.length());
		}
		return max;
	}

	public static void main(String[] args) {
		LongestSubstringWithoutRepeatingCharacters ls = new LongestSubstringWithoutRepeatingCharacters();

		String input0 = "";
		String input1 = "abcabcbb"; // abc
		String input2 = "bbbbb"; // b
		String input3 = "abbabb"; // ab
		String input4 = "abcadcb"; // adcb
		String input5 = "abcdabcdefgdefg"; // abcdefg
		String input6 = "wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco"; // mqbhcdarzowk

		System.out.println(ls.lengthOfLongestSubstring(input0)); // 0
		System.out.println(ls.lengthOfLongestSubstring(input1)); // 3
		System.out.println(ls.lengthOfLongestSubstring(input2)); // 1
		System.out.println(ls.lengthOfLongestSubstring(input3)); // 2
		System.out.println(ls.lengthOfLongestSubstring(input4)); // 4
		System.out.println(ls.lengthOfLongestSubstring(input5)); // 7
		System.out.println(ls.lengthOfLongestSubstring(input6)); // 12

	}

}
