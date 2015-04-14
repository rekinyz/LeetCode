package airbnb;

import org.junit.Assert;
import org.junit.Test;
/*
input un-ordered array of int, output array make sure all element in the array 
either both less than or large than element next to it.
 * 
 * 要求： 输入一个数组（未排序），输出数组要保证每一个一个数字要比它左右相邻的数字都小或者都大，类似ABABAB的格式。
 * 先假设是上升，然后下降，然后再上升。如果是下一步要上升，而前面的数反而大于后面的数，那就swap这两个数。
 * 如果下一步要下降，而前面的数反而是小于后面的数，那就swap这两个数。然后还要每一步更换方向(上升或者下降).
 * 问题：1. 如果输入中有数字相等，如何处理，因为全相等是无法排成ABABA的，估计是要不允许相等，要不输入数字没有相等的。
 * 2. 在输入数字有相等的情况，是否有 o(N)解？有否可能o(N)判断是否有解？应该没有o(N)解 应该是遇到=,就要找到一个大于，或小于的来替换。
 * */
public class ABAB {
    public static void swap(int[] a, int p) {
        int x = a[p];
        a[p] = a[p+1];
        a[p+1]= x;
    }
    public static int[] run(int[] a) {
        boolean up = true;
        for (int i = 0; i < a.length-1; ++i){
            if (up) {
                if (a[i] > a[i+1]) {
                    swap(a, i);
                }
            } else {
                if (a[i] < a[i+1]) {
                    swap(a, i);
                }
            }
            up = !up;
        }
        return a;
    }
    @Test
    public void test() {
        int[] a = {1,2,3,4,5,6,7,8};
        int[] b = {1,3,2,5,4,7,6,8};
        Assert.assertArrayEquals(b, run(a));
        int[] a1 = {8,2,3,4,5,6,7,3};
        int[] b1 = {2,8,3,5,4,7,3,6};
        Assert.assertArrayEquals(b1, run(a1));
        int[] a2 = {8,8,8,8,5,6,7,3};//{8,8,8,8,8,8,2,3}
        int[] b2 = {8,5,8,6,8,7,8,3};
        Assert.assertArrayEquals(b2, run(a2));
    }

}
