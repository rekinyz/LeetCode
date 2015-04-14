package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.leetcode.oj.BinaryTreePostorderTraversalTest;
import com.leetcode.oj.util.TreeNode;

public class BinaryTreePostorderTraversal extends BinaryTreePostorderTraversalTest {
    public static void recursive(TreeNode root, List<Integer> r) {
        if (root == null) return;
        recursive(root.left, r);
        recursive(root.right, r);
        r.add(root.val);
    }
    public static void stack(TreeNode root, List<Integer> r) {
        if (root == null) return;
        TreeNode currentNode, lastNode;

        Stack<TreeNode> s = new Stack<TreeNode>();

        currentNode = root;
        do {

            while(currentNode !=null) {

                s.push(currentNode);

                currentNode = currentNode.left;

            }

            lastNode = null;

            while(!s.isEmpty()) {

                currentNode = s.pop();

                // 右孩子不存在或已被访问，访问当前value

                if (currentNode.right == lastNode) {

                    r.add(currentNode.val);

                    lastNode = currentNode;

                } else {

                    s.push(currentNode);

                    currentNode = currentNode.right;

                    break;

                }

            }

        } while(!s.isEmpty());
    }

    @Override
    protected List<Integer> postorderTraversal(Integer[] input) {
        TreeNode root = TreeNode.convert(input);
        List<Integer> r = new ArrayList<Integer>();
        //recursive(root, r);
        stack(root, r);
        return r;
    }

}
