package search;

import com.leetcode.oj.SearchInsertPositionTest;

public class SearchInsertPosition extends SearchInsertPositionTest {
    @Override
    protected int searchInsert(int[] a, int target){
        return SearchForARange.lower_bound(a, 0, a.length, target);
    }
}
