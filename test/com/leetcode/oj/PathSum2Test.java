package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;

public class PathSum2Test {

	PathSum2 tree = new PathSum2();

	@Test
	public void testPathSum1() {
		Integer[] input = { 5 };
		assertEquals(Arrays.asList(5), pathSum(input, 5).get(0));
	}

	@Test
	public void testPathSum2() {
		Integer[] input = { -2, -3, -3 };
		assertEquals(Arrays.asList(-2, -3), pathSum(input, -5).get(0));
		assertEquals(Arrays.asList(-2, -3), pathSum(input, -5).get(1));
	}

	@Test
	public void testPathSum3() {
		Integer[] input = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1 };
		assertEquals(Arrays.asList(5, 4, 11, 2), pathSum(input, 22).get(0));
	}

	@Test
	public void testPathSum4() {
		Integer[] input = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, 5, 1 };
		assertEquals(Arrays.asList(5, 4, 11, 2), pathSum(input, 22).get(0));
		assertEquals(Arrays.asList(5, 8, 4, 5), pathSum(input, 22).get(1));
	}

	@Test
	public void testPathSum5() {
		Integer[] input = {};
		assertEquals(Arrays.asList(), pathSum(input, 1));
	}

	@Test
	public void testPathSum6() {
		Integer[] input = { 1, -2, -3, 1, 3, -2, null, -1 };
		assertEquals(Arrays.asList(1, -2, 3), pathSum(input, 2).get(0));
	}

	protected List<List<Integer>> pathSum(Integer[] input, int sum) {
		TreeNode root = TreeNode.convert(input);
		return tree.pathSum(root, sum);
	}

}
