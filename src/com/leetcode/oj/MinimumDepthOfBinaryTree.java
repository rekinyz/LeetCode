package com.leetcode.oj;

import com.leetcode.oj.util.TreeNode;

/**
 * Minimum Depth of Binary Tree
 * 
 * Given a binary tree, find its minimum depth.
 * 
 * The minimum depth is the number of nodes along the shortest path from the
 * root node down to the nearest leaf node.
 * 
 * @author rekinyz
 */
public class MinimumDepthOfBinaryTree {

	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int left = minDepth(root.left);
		int right = minDepth(root.right);

		if (left + right == 0) {
			return 1;
		}

		if (left * right == 0) {
			return left + right + 1;
		}

		return Math.min(left, right) + 1;
	}

	public static void main(String[] args) {

		MinimumDepthOfBinaryTree tree = new MinimumDepthOfBinaryTree();

		Integer[] input1 = { 1, -2, -3, 1, 3, -2, null, -1 };
		Integer[] input2 = { -2, null, -3 };
		Integer[] input3 = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1 };
		Integer[] input4 = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1 };

		TreeNode s1 = TreeNode.convert(input1);
		TreeNode s2 = TreeNode.convert(input2);
		TreeNode s3 = TreeNode.convert(input3);
		TreeNode s4 = TreeNode.convert(input4);

		TreeNode.print(s1);
		System.out.println(tree.minDepth(s1));

		TreeNode.print(s2);
		System.out.println(tree.minDepth(s2));

		TreeNode.print(s3);
		System.out.println(tree.minDepth(s3));

		TreeNode.print(s4);
		System.out.println(tree.minDepth(s4));

	}

}
