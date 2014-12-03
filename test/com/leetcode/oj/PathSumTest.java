package com.leetcode.oj;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;

public class PathSumTest {
	
	PathSum tree = new PathSum();
	
    @Test
    public void testHasPathSum1() {
    	Integer[] input = {1,-2,-3,1,3,-2,null,-1};;
    	assertTrue(hasPathSum(input, -1));
    }
    @Test
    public void testHasPathSum2() {
    	Integer[] input = {-2,null,-3};
    	assertTrue(hasPathSum(input, -5));
    }
    @Test
    public void testHasPathSum3() {
    	Integer[] input = {5,4,8,11,null,13,4,7,2,null,null,null,1};
    	assertTrue(hasPathSum(input, 22));
    }
    @Test
    public void testHasPathSum4() {
    	Integer[] input = {5,4,8,11,null,13,4,7,2,null,null,5,1};
    	assertTrue(hasPathSum(input, 22));
    }
    
    private boolean hasPathSum(Integer[] input, int sum) {
    	TreeNode root = TreeNode.convert(input);
    	return tree.hasPathSum(root, sum);
    }
   
}
