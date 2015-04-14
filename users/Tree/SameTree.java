package Tree;

import java.util.Stack;

import com.leetcode.oj.SameTreeTest;
import com.leetcode.oj.util.TreeNode;

public class SameTree extends SameTreeTest {
    public static boolean recursive(TreeNode p, TreeNode q) {
        if (p==null && q==null) return true;
        if (p==null || q==null) return false;
        return p.val == q.val && recursive(p.left, q.left) && recursive(p.right, q.right);
    }
    public static boolean run(TreeNode p, TreeNode q) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(p);
        s.push(q);
        while (!s.isEmpty()) {
            p = s.pop();
            q = s.pop();
            if (p==null && q==null) continue;
            if (p==null || q==null) return false;
            if (p.val != q.val) return false;
            s.push(p.left);
            s.push(q.left);
            s.push(p.right);
            s.push(q.right);
        }
        return true;
    }
    @Override
    protected boolean isSameTree(Integer[] p, Integer[] q)  {
        TreeNode t1 = TreeNode.convert(p);
        TreeNode t2 = TreeNode.convert(q);
        return run(t1,t2);
    }
}
