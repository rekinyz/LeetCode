package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;

public class BinaryTreePostorderTraversalTest {

	BinaryTreePostorderTraversal tree = new BinaryTreePostorderTraversal();

	@Test
	public void testPostorderTraversal1() {
		Integer[] input = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1 };
		assertEquals(Arrays.asList(7, 2, 11, 4, 1, 13, 4, 8, 5), postorderTraversal(input));
	}

	@Test
	public void testPostorderTraversal2() {
		Integer[] input = { 0, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, null, 1 };
		assertEquals(Arrays.asList(7, 2, 11, 4, 13, 1, 4, 8, 0), postorderTraversal(input));
	}

	@Test
	public void testPostorderTraversal3() {
		Integer[] input = { 1, null, 2, null, null, 3 };
		assertEquals(Arrays.asList(3, 2, 1), postorderTraversal(input));
	}

	@Test
	public void testPostorderTraversal4() {
		Integer[] input = { 1, -2, -3, 1, 3, -2, null, -1 };
		assertEquals(Arrays.asList(-1, 1, 3, -2, -2, -3, 1), postorderTraversal(input));
	}

	protected List<Integer> postorderTraversal(Integer[] input) {
		TreeNode root = TreeNode.convert(input);
		return tree.postorderTraversal(root);
	}

}
