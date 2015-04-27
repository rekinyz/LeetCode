package julian.qian.linear.linkedlist;

import com.leetcode.oj.RotateListTest;
import com.leetcode.oj.util.ListNode;
/*
 * Given a list, rotate the list to the right by k places, where k is non-negative.
For example: Given 1->2->3->4->5->nullptr and k = 2, return 4->5->1->2->3->nullptr.
先遍历一遍，得出链表长度len，注意k 可能大于len，因此令k% = len。将尾节点next 指针
指向首节点，形成一个环，接着往后跑len- k 步，从这里断开，就是要求的结果了。
 */
public class RotateList extends RotateListTest {

    @Override
    public ListNode rotateRight(int[] array, int k) {
        ListNode head = ListNode.convert(array);
        if (head == null || k==0) return head;
        int len = 1;
        ListNode p = head;
        while(p.next != null) {
            len++;
            p = p.next;
        }
        k = len-k%len;//因为是右移，所以n-k,右移一位，新的head是旧的尾巴
        p.next = head;
        for (int s = 0; s < k; s++) {
            p = p.next;
        }
        head = p.next;
        p.next = null;
        return head;
    }

}
