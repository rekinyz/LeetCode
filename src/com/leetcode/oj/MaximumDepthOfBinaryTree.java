package com.leetcode.oj;

import com.leetcode.oj.util.TreeNode;

/**
 * Maximum Depth of Binary Tree
 * 
 * Given a binary tree, find its maximum depth. The maximum depth is the number
 * of nodes along the longest path from the root node down to the farthest leaf
 * node. *
 * 
 * @author rekinyz
 */
public class MaximumDepthOfBinaryTree {

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
	}

	// print the tree to get intuitive view
	public static void main(String[] args) {

		MaximumDepthOfBinaryTree tree = new MaximumDepthOfBinaryTree();

		Integer[] input1 = { 1, -2, -3, 1, 3, -2, null, -1 }; // 4
		Integer[] input2 = { -2, null, -3 }; // 2
		Integer[] input3 = { null }; // 0
		Integer[] input4 = { 5 }; // 1

		TreeNode s1 = TreeNode.convert(input1);
		TreeNode s2 = TreeNode.convert(input2);
		TreeNode s3 = TreeNode.convert(input3);
		TreeNode s4 = TreeNode.convert(input4);

		TreeNode.print(s1);
		System.out.println(tree.maxDepth(s1));

		TreeNode.print(s2);
		System.out.println(tree.maxDepth(s2));

		TreeNode.print(s3);
		System.out.println(tree.maxDepth(s3));

		TreeNode.print(s4);
		System.out.println(tree.maxDepth(s4));
	}

}
