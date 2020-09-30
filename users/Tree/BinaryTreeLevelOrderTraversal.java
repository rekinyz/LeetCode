package Tree;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.Test;

public class BinaryTreeLevelOrderTraversal {
    public static void recursive(BinaryTreeNode<Integer> root, List<List<Integer>> r) {
        recursive(root, 1, r);
    }
    public static void recursive(BinaryTreeNode<Integer> root, int level, List<List<Integer>> r) {
        if (root == null) {
            return;
        }
        if (level > r.size()) {
            List<Integer> set = new ArrayList<Integer>();
            r.add(set);
        }
        List<Integer> set = r.get(level-1);
        set.add(root.val); // 这是traversal，可以加入，如果是print,这里打印就不对了，这其实是通过level，知道要加到哪个LIST里面去
        recursive(root.left, level+1, r);
        recursive(root.right, level+1, r);

    }
    public static void levelbyleveprint(BinaryTreeNode<Integer> root) {
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
        q.add(root);
        while (!q.isEmpty()) {
            BinaryTreeNode<Integer> top = q.poll();
            System.out.print(top.toString());
            if (top.left != null) {
                q.add(top.left);
            }
            if (top.right != null) q.add(top.right);
        }
        System.out.println();
    }
    public static void run(BinaryTreeNode<Integer> root, List<List<Integer>> r) {
        if (root == null) return;
        Queue<BinaryTreeNode<Integer>> current = new LinkedList<BinaryTreeNode<Integer>>();
        Queue<BinaryTreeNode<Integer>> next = new LinkedList<BinaryTreeNode<Integer>>();
        List<Integer> level = new ArrayList<Integer>();
        current.add(root);
        while (!current.isEmpty()) {
            while(!current.isEmpty()) {
                BinaryTreeNode<Integer> node = current.poll();
                level.add(node.val);
                if (node.left != null) next.add(node.left);
                if (node.right != null) next.add(node.right);
            }
            r.add(level);
            level.clear();
            Queue<BinaryTreeNode<Integer>> tmp = current;
            current = next;
            next = tmp;
            // current already empty, so no need to clear
        }
    }

    @Test
    public void test() {
        List<List<Integer>> r = new ArrayList<List<Integer>>();
        fail("Not yet implemented");
    }

}
