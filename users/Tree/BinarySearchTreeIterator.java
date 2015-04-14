package Tree;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;
/********************************************************************************** 
 * 
 * Implement an iterator over a binary search tree (BST).
 *  Your iterator will be initialized with the root node of a BST.
 * 
 * Calling next() will return the next smallest number in the BST.
 * 
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory,
 *  where h is the height of the tree. 
 * 
 * Credits:Special thanks to @ts for adding this problem and creating all test cases.
 *               
 **********************************************************************************/
// 中序遍历 到 List
public class BinarySearchTreeIterator {
    private final List<Integer> v;
    private final int pos;
    public BinarySearchTreeIterator(TreeNode root) {
        pos = 0;
        v = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(stack.size() > 0 || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                v.add(root.val);
                root = root.right;
            }
        }
    }
    public boolean hasNext() {
        return pos < v.size();
    }
    public int next() {
        return v.get(pos);
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
