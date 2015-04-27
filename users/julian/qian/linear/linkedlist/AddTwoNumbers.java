package julian.qian.linear.linkedlist;

import com.leetcode.oj.AddTwoNumbersTest;
import com.leetcode.oj.util.ListNode;

public class AddTwoNumbers extends AddTwoNumbersTest {

    @Override
    public ListNode addTwoNumbers(int[] a1, int[] a2) {
        ListNode l1 = ListNode.convert(a1);
        ListNode l2 = ListNode.convert(a2);
        // 用dummy node 保存头指针，不用判断是否是头
        ListNode dummy = new ListNode(-1);
        int carry = 0;
        ListNode prev = dummy;
        for (ListNode pa = l1, pb = l2; pa!=null || pb!=null;
                pa=(pa==null)?null:pa.next,
                pb=(pb==null)?null:pb.next, prev = prev.next) {
            int ai = (pa==null)?0:pa.val;
            int bi = (pb==null)?0:pb.val;
            int v = (ai+bi+carry);
            carry = v / 10;
            v = v % 10;
            prev.next = new ListNode(v);
        }
        if (carry > 0) {
            prev.next = new ListNode(carry);
        }
        return dummy.next;
    }

}
