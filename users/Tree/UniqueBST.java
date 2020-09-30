package Tree;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;

public class UniqueBST {
    public static int run(int n) {
        int[] f = new int[n+1];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i <= n; ++i) {
            for (int k = 1; k<=i; ++k) {
                f[i]+= f[k-1] * f[i-k];
            }
        }
        return f[n];
    }
    public static List<TreeNode> gen(int n) {
        if (n == 0) return gen(1,0);
        return gen(1,n);
    }
    private static List<TreeNode> gen(int start, int end) {
        List<TreeNode> trees = new ArrayList<TreeNode>();
        if (start > end) {
            trees.add(null);
            return trees;
        }
        for (int k = start; k <= end; k++) {
            List<TreeNode> left = gen(start, k-1);
            List<TreeNode> right = gen(k+1, end);
            for (TreeNode a: left) {
                for (TreeNode b: right) {
                    TreeNode root = new TreeNode(k);
                    root.left = a;
                    root.right = b;
                    trees.add(root);
                }
            }
        }
        return trees;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
