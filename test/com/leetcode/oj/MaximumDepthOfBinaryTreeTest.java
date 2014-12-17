package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;

public class MaximumDepthOfBinaryTreeTest {

	MaximumDepthOfBinaryTree tree = new MaximumDepthOfBinaryTree();

	@Test
	public void testMaxDepth1() {
		Integer[] input = { 1, -2, -3, 1, 3, -2, null, -1 };
		assertEquals(4, maxDepth(input));
	}

	@Test
	public void testMaxDepth2() {
		Integer[] input = { -2, null, -3 };
		assertEquals(2, maxDepth(input));
	}

	@Test
	public void testMaxDepth3() {
		Integer[] input = { null };
		assertEquals(0, maxDepth(input));
	}

	@Test
	public void testMaxDepth4() {
		Integer[] input = { 5 };
		assertEquals(1, maxDepth(input));
	}

	private int maxDepth(Integer[] input) {
		TreeNode root = TreeNode.convert(input);
		return tree.maxDepth(root);
	}

}
