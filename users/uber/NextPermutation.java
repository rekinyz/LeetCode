package uber;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


// leetcode 2.1.12, page 25
public class NextPermutation {
    public static int[] next(int[] n) {
        if (n.length == 1) return n;
        int[] r = Arrays.copyOf(n, n.length);
        int i= r.length-2;
        for (; i >=0; i--) {
            if(r[i] < r[i+1]) {
                for (int j = r.length-1; j > i; j++){
                    if(r[j] > r[i]) {
                        swap(r, i, j);
                        break;
                    }
                }
                break;
            }
        }
        // reverse from i+1 to end.
        reverseRange(r, i+1, n.length-1);
        return r;
    }
    public static void reverseRange(int[] n, int s, int e) {
        while (e > s) {
            swap(n, s, e);
            e--;
            s++;
        }
    }
    public static void swap(int[] n, int i, int j) {
        assert(i != j);
        int s = n[i];
        n[i] = n[j];
        n[j] = s;
    }
    @Test
    public void test() {
        int[] r1 = {1,3,2};
        int[] r2 = {1,2,3};
        int[] r3 = {1,5,1};
        int[] r4 = {2,1};
        int[] r5 = {1};
        
        int[] i1 = {1,2,3};
        int[] i2 = {3,2,1};
        int[] i3 = {1,1,5};
        int[] i4 = {1,2};
        int[] i5 = {1};

        Assert.assertArrayEquals(r1, next(i1));
        Assert.assertArrayEquals(r2, next(i2));
        Assert.assertArrayEquals(r3, next(i3));
        Assert.assertArrayEquals(r4, next(i4));
        Assert.assertArrayEquals(r5, next(i5));
    }

}
