package com.leetcode.oj;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;

public class BinaryTreeInorderTraversalTest {

	BinaryTreeInorderTraversal tree = new BinaryTreeInorderTraversal();

	@Test
	public void testInorderTraversal1() {
		Integer[] input = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1 };
		assertEquals(Arrays.asList(7, 11, 2, 4, 5, 13, 1, 8, 4), inorderTraversal(input));
	}

	@Test
	public void testInorderTraversal2() {
		Integer[] input = { 0, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, null, 1 }; 
		assertEquals(Arrays.asList(7, 11, 2, 4, 0, 13, 8, 4, 1), inorderTraversal(input));
	}

	@Test
	public void testInorderTraversal3() {
		Integer[] input = { 1, null, 2, null, null, 3 };
		assertEquals(Arrays.asList(1, 3, 2), inorderTraversal(input));
	}

	@Test
	public void testInorderTraversal4() {
		Integer[] input = { 1, -2, -3, 1, 3, -2, null, -1 };
		assertEquals(Arrays.asList(-1, 1, -2, 3, 1, -2, -3), inorderTraversal(input));
	}

	private List<Integer> inorderTraversal(Integer[] input) {
		TreeNode root = TreeNode.convert(input);
		return tree.inorderTraversal(root);
	}

}
