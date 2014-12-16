package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SubsetsTest {

	Subsets ss = new Subsets();

	@Test
	public void testSubsets1() {
		int[] input = { 1, 2 };
		List<List<Integer>> res = subsets(input);
		int len = res.size();
		assertEquals(len, 4);
		List<List<? extends Object>> expected = Arrays.asList(Arrays.asList(),
				Arrays.asList(1), Arrays.asList(2), Arrays.asList(1, 2));
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < res.get(i).size(); j++) {
				assertEquals(res.get(i).get(j), expected.get(i).get(j));
			}
		}
	}

	@Test
	public void testSubsets2() {
		int[] input = { 1, 2, 3 };
		List<List<Integer>> res = subsets(input);
		int len = res.size();
		assertEquals(len, 8);
		List<List<? extends Object>> expected = Arrays.asList(Arrays.asList(),
				Arrays.asList(1), Arrays.asList(2), Arrays.asList(1, 2),
				Arrays.asList(3), Arrays.asList(1, 3), Arrays.asList(2, 3),
				Arrays.asList(1, 2, 3));

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < res.get(i).size(); j++) {
				assertEquals(res.get(i).get(j), expected.get(i).get(j));
			}
		}
	}

	@Test
	public void testSubsets3() {
		int[] input = { 4, 1, 0 };
		List<List<Integer>> res = subsets(input);
		int len = res.size();
		assertEquals(len, 8);
		List<List<? extends Object>> expected = Arrays.asList(Arrays.asList(),
				Arrays.asList(0), Arrays.asList(1), Arrays.asList(0, 1),
				Arrays.asList(4), Arrays.asList(0, 4), Arrays.asList(1, 4),
				Arrays.asList(0, 1, 4));

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < res.get(i).size(); j++) {
				assertEquals(res.get(i).get(j), expected.get(i).get(j));
			}
		}
	}

	private List<List<Integer>> subsets(int[] S) {
		return ss.subsets(S);
	}

}
