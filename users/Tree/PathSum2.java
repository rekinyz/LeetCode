package Tree;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.oj.PathSum2Test;
import com.leetcode.oj.util.TreeNode;

public class PathSum2 extends PathSum2Test {
    List<List<Integer>> r;
    List<Integer> cur;
    void run(TreeNode root, int sum) {
        if (root == null) return;
        cur.add(root.val);
        if (root.left == null && root.right == null) {
            if (sum == root.val) {
                r.add(new ArrayList<Integer>(cur));
            }
        }
        run(root.left, sum-root.val);
        run(root.right, sum-root.val);
        cur.remove(cur.size()-1);
    }
    @Override
    protected List<List<Integer>> pathSum(Integer[] input, int sum) {
        TreeNode root = TreeNode.convert(input);
        r = new ArrayList<List<Integer>>();
        cur = new ArrayList<Integer>();
        run(root, sum);
        return r;
    }
}
