package com.leetcode.oj;

import com.leetcode.oj.util.TreeNode;

/**
 * Same Tree
 * 
 * Given two binary trees, write a function to check if they are equal or not.
 * 
 * Two binary trees are considered equal if they are structurally identical and
 * the nodes have the same value.
 * 
 * @author rekinyz
 */
public class SameTree {

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == q)
			return true;
		if (p != null && q == null || p == null && q != null || p != null && q != null && p.val != q.val) {
			return false;
		}
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}

	// print the tree to get intuitive view
	public static void main(String[] args) {

		SameTree tree = new SameTree();

		Integer[] input1 = { 1, -2, -3, 1, 3, -2, null, -1 };
		Integer[] input2 = { -2, null, -3 };
		Integer[] input3 = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1 };
		Integer[] input4 = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1 };
		Integer[] input5 = { 0 };
		Integer[] input6 = { 0 };

		TreeNode s1 = TreeNode.convert(input1);
		TreeNode s2 = TreeNode.convert(input2);
		TreeNode s3 = TreeNode.convert(input3);
		TreeNode s4 = TreeNode.convert(input4);
		TreeNode s5 = TreeNode.convert(input5);
		TreeNode s6 = TreeNode.convert(input6);

		TreeNode.print(s1);
		TreeNode.print(s2);
		TreeNode.print(s3);
		TreeNode.print(s4);
		TreeNode.print(s5);

		System.out.println(tree.isSameTree(s1, s1)); // true
		System.out.println(tree.isSameTree(s2, s1)); // false
		System.out.println(tree.isSameTree(s3, s4)); // false
		System.out.println(tree.isSameTree(s4, s4)); // true
		System.out.println(tree.isSameTree(s3, s3)); // true
		System.out.println(tree.isSameTree(s5, s6)); // true
	}

}
