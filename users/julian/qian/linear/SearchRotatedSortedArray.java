package julian.qian.linear;

import com.leetcode.oj.SearchInRotatedSortedArrayTest;

public class SearchRotatedSortedArray extends SearchInRotatedSortedArrayTest{
    public static int run(int[] a, int target) {
        int s = 0; int e = a.length-1;
        
        while (e >= s) {
            int m = (e+s) /2;
            if (target == a[m]) return m;
            if (a[m] > a[e]) {
                if (target > a[e] && target < a[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else {
                if (target > a[m] && target <= a[e]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }
        return -1;
    }

    @Override
    protected int search(int[] A, int target) {
        return run(A, target);
    }

}
