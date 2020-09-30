package julian.qian.linear;


import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.leetcode.oj.RemoveDuplicatesFromSortedArrayTest;

public class RemoveDupFromSort extends RemoveDuplicatesFromSortedArrayTest{
    public static int[] allTwice(int[] a) {
        if (a.length <= 2) return a;
        int index = 2;
        for (int i = 2; i < a.length; i++){
            if (a[i] != a[index - 2])
            a[index++] = a[i];
        }
        return Arrays.copyOf(a, index);
    }
    
    public static int[] allown(int[] a, int n) {
        int pos = 0;
        int count = 0;
        for (int i = 0; i<a.length; ++ i) {
            System.out.format("i %d pos %d count %d a[i] %d a[po] %d\r\n", i, pos, count, a[i], a[pos]);
            if (a[pos] != a[i]) {
                pos+= Math.min(n, count);
                a[pos] = a[i];
                count = 1;
            } else {
                count++;
            }
        }
        return Arrays.copyOf(a, pos+Math.min(n, count));
    }
    
    public static int[] run(int[] a) {
        return Arrays.copyOf(a, remove(a));
    }
    
    public static int remove(int[] a) {
        if (a.length == 0) return 0;
        int pos = 0;
        for (int i = 0; i<a.length; ++ i) {
            if (a[pos] != a[i]) {
                pos++;
                a[pos] = a[i];
            }
        }
        return pos+1;
    }

    @Override
    protected int removeDuplicates(int[] input) {
        return remove(input);
    }

    @Test
    public void test() {
        int[] a = {1,1,2,2,3,5,7,8,8,8,8};
        int[] a1 = {1,1,1,2,2,3,5,7,8,8,8,8};
        int[] a2 = {1,1,1,1,2,3,5,7,8,8,8,8};
        int[] a3 = {1,1,2,2,2,2,3,5,7,8,8,8,8};
        int[] b = {1,2,3,5,7,8};
        int[] b1 = {1,1,2,2,3,5,7,8,8};
        Assert.assertArrayEquals(b, run(a));
        int[] r1 = allTwice(a1);
        System.out.println(Arrays.toString(r1));
        Assert.assertArrayEquals(b1, r1);
        int[] b2 = {1,1,1,2,3,5,7,8,8,8};
        int[] b3 = {1,1,2,2,2,2,3,5,7,8,8,8,8};
        Assert.assertArrayEquals(b2, allown(a2, 3));
        Assert.assertArrayEquals(b3, allown(a3, 4));
        //Collections.sort(list);
    }

}
