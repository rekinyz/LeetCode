package com.leetcode.oj;

import com.leetcode.oj.util.TreeNode;

/**
 * Path Sum
 * 
 *  Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 *  For example: Given the below binary tree and sum = 22,
 *       	   5
 *            / \
 *           4   8
 *          /   / \
 *         11  13  4
 *        /  \      \
 *       7    2      1
 * 
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 * 
 * @author rekinyz
 *
 */
public class PathSum {

	public boolean hasPathSum(TreeNode root, int sum) {
		if(root!=null)
			return root.left==null && root.right==null && sum==root.val || hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
		return false;
	}

	//print the tree to get intuitive view
	public static void main(String[] args) {
		
		PathSum ps = new PathSum();
		
		Integer[] input1 = {1,-2,-3,1,3,-2,null,-1};
		Integer[] input2 = {-2,null,-3};
		Integer[] input3 = {5,4,8,11,null,13,4,7,2,null,null,null,1};
		Integer[] input4 = {5,4,8,11,null,13,4,7,2,null,null,5,1};

		TreeNode s1 = TreeNode.convert(input1);
		TreeNode s2 = TreeNode.convert(input2);
		TreeNode s3 = TreeNode.convert(input3);
		TreeNode s4 = TreeNode.convert(input4);
		
		System.out.println(ps.hasPathSum(s1, -1));
		System.out.println(ps.hasPathSum(s2, -5));
		System.out.println(ps.hasPathSum(s3, 22));
		System.out.println(ps.hasPathSum(s4, 22));
	}

}
