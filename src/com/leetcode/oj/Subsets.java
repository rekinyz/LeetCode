package com.leetcode.oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Subsets Given a set of distinct integers, S, return all possible subsets.
 * 
 * Note:
 * 
 * Elements in a subset must be in non-descending order. The solution set must
 * not contain duplicate subsets.
 * 
 * For example, If S = [1,2,3], a solution is:
 * 
 * [ [3], [1], [2], [1,2,3], [1,3], [2,3], [1,2], [] ]
 * 
 * @author z001raxe
 *
 */
public class Subsets {

	public List<List<Integer>> subsets(int[] S) {
		int len = S.length, newLen = 1 << len;
		List<List<Integer>> res = new ArrayList<List<Integer>>(newLen);
		Arrays.sort(S);
		for (int i = 0; i < newLen; i++) {
			List<Integer> list = new ArrayList<Integer>(len);
			for (int j = 0; j < len; j++) {
				if ((i & (1 << j)) != 0)
					list.add(S[j]);
			}
			res.add(list);
		}
		return res;
	}

}
