package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.leetcode.oj.BinaryTreePreorderTraversalTest;
import com.leetcode.oj.util.TreeNode;

public class BinaryTreePreorderTraversal extends BinaryTreePreorderTraversalTest {
    public static void recursive(TreeNode root, List<Integer> r) {
        if (root == null) return;
        r.add(root.val);
        recursive(root.left, r);
        recursive(root.right, r);
    }
    public static void stack(TreeNode root, List<Integer> r) {
        if (root == null) return;
        Stack<TreeNode> q = new Stack<TreeNode>();
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode node = q.pop();
            r.add(node.val);
            if (node.right != null) {
                q.add(node.right);
            }
            if (node.left != null) {
                q.add(node.left);                
            }
        }
    }
    public static void morris(TreeNode root, List<Integer> r) {
        TreeNode cur, prev;
        cur = root;
        while(cur != null) {
            if (cur.left == null) {
                r.add(cur.val);
                prev = cur;
                cur = cur.right;
            } else {
                TreeNode node = cur.left;
                while(node.right != null && node.right != cur) {
                    node = node.right;
                }
                if(node.right == null) {
                    r.add(cur.val);
                    node.right = cur;
                    prev = cur;
                    cur = cur.left;
                } else {
                    node.right = null;
                    cur = cur.right;
                }
            }
        }
    }
    @Override
    protected List<Integer> preorderTraversal(Integer[] input) {
        TreeNode root = TreeNode.convert(input);
        List<Integer> r = new ArrayList<Integer>();
        //recursive(root, r);
        //stack(root, r);
        morris(root, r);
        return r;
    }

}
