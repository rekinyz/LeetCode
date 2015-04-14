package Tree;
import java.util.LinkedList;
import java.util.Queue;


public class BinaryTreeNode<T> {
    public T val;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;
    public BinaryTreeNode(T t) {
        val = t;
    }
    @Override
    public String toString() {
        return val.toString();
    }
    public static BinaryTreeNode<Integer> getTree(int num) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(num);
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
        q.add(root);
        while (num > 0) {
            BinaryTreeNode<Integer> top = q.peek();
            if (top.left == null) {
                num--;
                top.left = new BinaryTreeNode<Integer>(num);
                q.add(top.left);
                continue;
            }
            if (top.right == null) {
                num--;
                top.right = new BinaryTreeNode<Integer>(num);
                q.remove();
                q.add(top.right);
            }
        }
        
        return root;
    }

    public static void printBinTreeByLevel(BinaryTreeNode<Integer> root) {
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

    
}
