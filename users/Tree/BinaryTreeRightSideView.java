package Tree;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;

public class BinaryTreeRightSideView {
    public static void run(TreeNode root, int level, List<Integer> r) {
        if (root == null) return;
        if (r.size() < level) r.add(root.val);
        run(root.right, level+1, r);
        run(root.left, level+1, r);
    }
    public static List<Integer> run(TreeNode root) {
        List<Integer> r = new ArrayList<Integer>();
        run(root, 1, r);
        return r;
    }
    public static void run(TreeNode root, List<Integer> r) {
        if (root==null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> level = new Stack<Integer>();
        stack.add(root);
        level.add(1);
        while(stack.size() > 0) {
            TreeNode n = stack.pop();
            int l = level.pop();
            if (r.size() < l) {
                r.add(n.val);
            }
            if (n.left != null) {
                stack.push(n.left);
                level.push(l+1);
            }
            if (n.right != null) {
                stack.push(n.right);
                level.push(l+1);
            }
        }
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
