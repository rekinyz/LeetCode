package sort;

import com.leetcode.oj.MergeSortedArrayTest;

public class MergeSortedArray extends MergeSortedArrayTest {

    @Override
    protected int[] merge(int[] A, int m, int[] B, int n) {
        int i = m+n-1, a=m-1, b = n-1; 
        for (; i >= 0 && b>=0; i--) {
            if (a>=0 && A[a] > B[b]) {
                A[i] = A[a];
                a--;
            } else {
                A[i] = B[b];
                b--;
            }
        }
        return A;
    }

}
