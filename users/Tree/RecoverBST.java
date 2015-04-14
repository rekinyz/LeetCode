package Tree;

import static org.junit.Assert.fail;

import org.junit.Test;
/*
 * O(n) 空间的解法是，开一个指针数组，中序遍历，将节点指针依次存放到数组里，然后寻找两
处逆向的位置，先从前往后找第一个逆序的位置，然后从后往前找第二个逆序的位置，交换这两个
指针的值。
 */
public class RecoverBST {
    public static void recoverTree(BinaryTreeNode<Integer> root) {
        BinaryTreeNode<Integer> b1, b2, prev= null, cur = root;
        while(cur != null) {
            //if(cur.left == )
        }
    }
    public void detect(BinaryTreeNode<Integer> b1, BinaryTreeNode<Integer> b2,
            BinaryTreeNode<Integer> prev, BinaryTreeNode<Integer> cur) {
        if (prev != null && prev.val > cur.val) {
            if (b1 == null) {
                b1 = prev;
            }
            b2 = cur;
        }
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
