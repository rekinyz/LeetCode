package com.leetcode.oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Letter Combinations of a Phone Number Given a digit string, return all
 * possible letter combinations that the number could represent.
 * 
 * A mapping of digit to letters (just like on the telephone buttons) is given
 * below.
 * 
 * http://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Telephone-keypad2.
 * svg/200px-Telephone-keypad2.svg.png
 * 
 * Input:Digit string "23" Output: ["ad", "ae", "af", "bd", "be", "bf", "cd",
 * "ce", "cf"].
 * 
 * Note: Although the above answer is in lexicographical order, your answer
 * could be in any order you want.
 * 
 * @author rekinyz
 */
public class LetterCombinationsOfAPhoneNumber {

	private final static String[] LETTERS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public List<String> letterCombinations(String digits) {
		List<String> res = Arrays.asList("");
		for (char dig : digits.toCharArray()) {
			List<String> track = new ArrayList<>();
			// dig-'0' means convert digit char to int as index of the LETTERS
			for (char letter : LETTERS[dig - '0'].toCharArray()) {
				for (String prefix : res) {
					track.add(prefix + letter);
				}
			}
			res = track;
		}
		return res;
	}

	public List<String> letterCombinations1(String digits) {
		List<String> res = new ArrayList<>();
		combination("", digits, 0, res);
		return res;
	}

	private void combination(String prefix, String digits, int idx, List<String> res) {
		if (idx < digits.length()) {
			for (char letter : LETTERS[digits.charAt(idx) - '0'].toCharArray()) {
				combination(prefix + letter, digits, idx+1, res);
			}
		}else{
			res.add(prefix);
		}
	}

	private static final Map<Character, String> map = new HashMap<>();
	static {
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
	}

	public List<String> letterCombinations2(String digits) {
		List<String> res = Arrays.asList("");
		for (char dig : digits.toCharArray()) {
			List<String> track = new ArrayList<>();
			for (char letter : map.get(dig).toCharArray()) {
				for (String prefix : res) {
					track.add(prefix + letter);
				}
			}
			res = track;
		}
		return res;
	}

}
