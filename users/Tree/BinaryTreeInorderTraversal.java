package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.leetcode.oj.BinaryTreeInorderTraversalTest;
import com.leetcode.oj.util.TreeNode;

public class BinaryTreeInorderTraversal extends BinaryTreeInorderTraversalTest {
    public static void recursive(TreeNode root, List<Integer> r) {
        if (root == null) return;
        recursive(root.left, r);
        r.add(root.val);
        recursive(root.right, r);
    }
    public static void stack(TreeNode root, List<Integer> r) {
        if (root == null) return;
        Stack<TreeNode> q = new Stack<TreeNode>();
        TreeNode p = root;
        while(!q.isEmpty()||p!=null) {
            if (p != null) {
                q.push(p);
                p = p.left;
            } else {
                TreeNode n = q.pop();
                r.add(n.val);
                p = n.right;
            }
        }
    }

    @Override
    protected List<Integer> inorderTraversal(Integer[] input) {
        TreeNode root = TreeNode.convert(input);
        List<Integer> r = new ArrayList<Integer>();
        //recursive(root, r);
        stack(root, r);
        return r;
    }

}
