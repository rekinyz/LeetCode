package com.leetcode.oj;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.oj.util.TreeNode;

/**
 * Path Sum II
 * 
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum. 
 * For example: Given the below binary tree and sum = 22,
 *
 *             5
 *            / \
 *           4   8
 *          /   / \
 *         11  13  4
 *        /  \    / \
 *       7    2  5   1
 *       
 * return
 * 
 * [
 * 	 [5,4,11,2],
 * 	 [5,8,4,5]
 * ]
 * 
 * @author rekinyz
 *
 */
public class PathSum2 {
    
	public List<List<Integer>> pathSum(TreeNode root, int sum){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		findPaths(root, sum, new ArrayList<Integer>(), result);
    	return result;
    }
	
	private void findPaths(TreeNode root, int sum, List<Integer> path, List<List<Integer>> result){
		//create each time new path list for every node of the tree
		path = new ArrayList<Integer>(path);
		if(root!=null){
			int rest = sum-root.val;
			if(rest==0 && root.left==null && root.right==null){
				path.add(root.val);
				result.add(path);
			}else{
				path.add(root.val);
				findPaths(root.left, rest, path, result);
				findPaths(root.right, rest, path, result);
			}
		}
	}
	
	//print the tree to get intuitive view
	public static void main(String[] args) {
		
		PathSum2 ps = new PathSum2();
		
		Integer[] input1 = {5};
		Integer[] input2 = {-2,-3,-3};
		Integer[] input3 = {5,4,8,11,null,13,4,7,2,null,null,null,1};
		Integer[] input4 = {5,4,8,11,null,13,4,7,2,null,null,null,null,5,1};
		Integer[] input5 = {};
		Integer[] input6 = {1,-2,-3,1,3,-2,null,-1};

		TreeNode s1 = TreeNode.convert(input1);
		TreeNode s2 = TreeNode.convert(input2);
		TreeNode s3 = TreeNode.convert(input3);
		TreeNode s4 = TreeNode.convert(input4);
		TreeNode s5 = TreeNode.convert(input5);
		TreeNode s6 = TreeNode.convert(input6);
		
		TreeNode.print(s1);
		System.out.println(ps.pathSum(s1, 5)); //[[5]]
		
		TreeNode.print(s2);
		System.out.println(ps.pathSum(s2, -5)); //[[-2,-3],[-2,-3]]
		
		TreeNode.print(s3);
		System.out.println(ps.pathSum(s3, 22)); //[[5,4,11,2]]

		TreeNode.print(s4);
		System.out.println(ps.pathSum(s4, 22)); //[5,4,11,2],[5,8,4,5]]
		
		TreeNode.print(s5);
		System.out.println(ps.pathSum(s5, 1)); //[]
		
		TreeNode.print(s6);
		System.out.println(ps.pathSum(s6, 2));  //[[1,-2,3]]
	}

}
