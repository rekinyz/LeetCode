package sort;

import java.util.Arrays;
import java.util.List;

import com.leetcode.oj.MergeKSortedListsTest;
import com.leetcode.oj.util.ListNode;

public class MergeKSortedLists extends MergeKSortedListsTest {

    @Override
    protected ListNode mergeKLists(ListNode... node) {
        List<ListNode> lists = Arrays.asList(node);
        if (lists.size() == 0) return null;
        ListNode p = lists.get(0);
        for (int i = 1; i < lists.size(); ++i) {
            p = MergeTwoSortedLists.run(p, lists.get(i));
        }
        return p;
    }

}
