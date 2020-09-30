package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;

public class MinimumDepthOfBinaryTreeTest {

	MinimumDepthOfBinaryTree tree = new MinimumDepthOfBinaryTree();

	@Test
	public void testMinDepth1() {
		Integer[] input = { 1, -2, -3, 1, 3, -2, null, -1 };
		assertEquals(3, minDepth(input));
	}

	@Test
	public void testMinDepth2() {
		Integer[] input = { -2, null, -3 };
		assertEquals(2, minDepth(input));
	}

	@Test
	public void testMinDepth3() {
		Integer[] input = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1 };
		assertEquals(3, minDepth(input));
	}

	@Test
	public void testMinDepth4() {
		Integer[] input = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1 };
		assertEquals(3, minDepth(input));
	}

	protected int minDepth(Integer[] input) {
		TreeNode root = TreeNode.convert(input);
		return tree.minDepth(root);
	}

}
