package Tree;

import java.util.Stack;

import com.leetcode.oj.MinimumDepthOfBinaryTreeTest;
import com.leetcode.oj.util.TreeNode;

public class MinimumDepthOfBinaryTree extends MinimumDepthOfBinaryTreeTest {
    protected static int recursive(TreeNode root) {
        return recursive(root, false);
    }
    protected static int recursive(TreeNode root, boolean hasbrother) {
        if (root == null) return (hasbrother)?Integer.MAX_VALUE:0;
        return 1 + Math.min(recursive(root.left, root.right !=null),
                recursive(root.right, root.left != null));
    }
    private static class NodeAndDepth {
        TreeNode node;
        int depth;
        public NodeAndDepth(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
    protected static int min(TreeNode root) {
        if (root == null) return 0;
        int r = Integer.MAX_VALUE;
        Stack<NodeAndDepth> s = new Stack<NodeAndDepth>();
        s.add(new NodeAndDepth(root, 1));
        while (!s.isEmpty()) {
            NodeAndDepth n = s.pop();
            TreeNode node = n.node;
            int depth = n.depth;
            if (node.left == null && node.right == null) {
                r = Math.min(r, depth);
            }
            if (node.left != null && r > depth) {
                s.add(new NodeAndDepth(node.left, depth+1));
            }
            if (node.right != null && r > depth) {
                s.add(new NodeAndDepth(node.right, depth+1));
            }
        }
        return r;
    }
    @Override
    protected int minDepth(Integer[] input) {
        TreeNode root = TreeNode.convert(input);
        //return recursive(root);
        return min(root);
    }

}
