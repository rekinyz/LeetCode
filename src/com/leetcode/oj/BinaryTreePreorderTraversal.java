package com.leetcode.oj;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.oj.util.TreeNode;

/**
 * Binary Tree Preorder Traversal
 * 
 * Given a binary tree, return the preorder traversal of its nodes' values.
 *
 * For example:
 * Given binary tree {1,#,2,3},
 *
 *  1
 *   \
 *    2
 *   /
 *  3
 *
 * return [1,2,3].
 *
 * Note: Recursive solution is trivial, could you do it iteratively?
 *
 * @author rekinyz
 *
 */
public class BinaryTreePreorderTraversal {

	//TODO use iterateve way in stead of trivial recursive solution
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		preorderTraversal(root, result);
		return result;
    }
	
	private void preorderTraversal(TreeNode root, List<Integer> result){
		if(root!=null){
			result.add(root.val);
			preorderTraversal(root.left, result);
			preorderTraversal(root.right, result);
		}
	}
    
	//print the tree to get intuitive view
	public static void main(String[] args) {
		BinaryTreePreorderTraversal tree = new BinaryTreePreorderTraversal();
		
		Integer[] input1 = {5,4,8,11,null,13,4,7,2,null,null,null,1};
		Integer[] input2 = {0,4,8,11,null,13,4,7,2,null,null,null,null,null,1};
		Integer[] input3 = {1,null,2,null,null,3};
		Integer[] input4 = {1,-2,-3,1,3,-2,null,-1};
		
		TreeNode root1 = TreeNode.convert(input1);
		TreeNode root2 = TreeNode.convert(input2);
		TreeNode root3 = TreeNode.convert(input3);
		TreeNode root4 = TreeNode.convert(input4);
		
		TreeNode.print(root1);
		System.out.println(tree.preorderTraversal(root1));
		
		TreeNode.print(root2);
		System.out.println(tree.preorderTraversal(root2));
		
		TreeNode.print(root3);
		System.out.println(tree.preorderTraversal(root3));
		
		TreeNode.print(root4);
		System.out.println(tree.preorderTraversal(root4));
	}
}
