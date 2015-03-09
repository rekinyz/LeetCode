package julian.qian.linear;

import com.leetcode.oj.MedianOfTwoSortedArraysTest;

public class MedianOfTwoSortedArrays extends MedianOfTwoSortedArraysTest{

    protected int findK(int[] a, int s1, int e1, int[] b, int s2, int e2, int k){
        System.out.format("s1 %d e1 %d s2 %d e2 %d k %d\r\n", s1, e1, s2, e2, k);
        int m = e1-s1;
        int n = e2-s2;
        if (m > n) return findK(b, s2, e2, a, s1, e1, k);
        if (m ==0) return b[s2+k-1];
        if (k==1) return Math.min(a[s1], b[s2]);
        int apos = Math.min(k/2, m);
        int bpos = k-apos;
        if (a[s1+apos-1] < b[s2+bpos-1]) {
            return findK(a, s1+apos, e1, b, s2, e2, k-apos);
        } else if (a[s1+apos-1] > b[s2+bpos-1]) {
            return findK(a, s1, e1, b, s2+bpos, e2, k-bpos);
        } else {
            return a[s1+apos-1];
        }
    }

    
    @Override
    protected double findMedianSortedArrays(int[] input1, int[] input2){
        int s = input1.length + input2.length;
        int p = (input1.length + input2.length)/2;
        if ((s & 0x1) == 0) {
            return (findK(input1, 0, input1.length, input2, 0, input2.length, p) +
                    findK(input1, 0, input1.length, input2, 0, input2.length, p+1))/2;
        } else {
            return findK(input1, 0, input1.length, input2, 0, input2.length, p + 1);
        }
    }
}
