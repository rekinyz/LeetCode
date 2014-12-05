package com.leetcode.oj;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;

public class BinaryTreePreorderTraversalTest {

	BinaryTreePreorderTraversal tree = new BinaryTreePreorderTraversal();

	@Test
	public void testPreorderTraversal1() {
		Integer[] input = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1 };
		assertEquals(preorderTraversal(input), Arrays.asList(5, 4, 11, 7, 2, 8, 13, 1, 4));
	}

	@Test
	public void testPreorderTraversal2() {
		Integer[] input = { 0, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, null, 1 };
		assertEquals(preorderTraversal(input), Arrays.asList(0, 4, 11, 7, 2, 8, 13, 4, 1));
	}

	@Test
	public void testPreorderTraversal3() {
		Integer[] input = { 1, null, 2, null, null, 3 };
		assertEquals(preorderTraversal(input), Arrays.asList(1, 2, 3));
	}

	@Test
	public void testPreorderTraversal4() {
		Integer[] input = { 1, -2, -3, 1, 3, -2, null, -1 };
		assertEquals(preorderTraversal(input), Arrays.asList(1, -2, 1, -1, 3, -3, -2));
	}

	private List<Integer> preorderTraversal(Integer[] input) {
		TreeNode root = TreeNode.convert(input);
		return tree.preorderTraversal(root);
	}

}
