package julian.qian.linear;


import java.util.ArrayList;
import java.util.List;



import org.junit.Assert;
import org.junit.Test;

public class PermutationSeq {
    public static int factorial(int n) {
        int r = 1;
        while (n > 1) {
            r *= n;
            n--;
        }
        return r;
    }
    public static int[] run(int n, int k) {
        int[] r = new int[n];
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            b.add(i);
        }
        int f = factorial(n-1);
        
        for (int i = n-1; i > 0; --i) {
            int pos = k/f;
            int a = b.get(pos);
            System.out.format("i %d p %d a %d k %d f %d\r\n", i, pos, a, k, f);
            k = k % f;
            r[n-i-1] = a;
            f = f / (i);
            b.remove(pos);
        }
        r[n-1] = b.get(0);
        // add last ones
        return r;
    }
    
    @Test
    public void test() {
        int[] a1 = {1,2,3};
        int[] a2 = {2,1,3};
        int[] a3 = {2,3,1};
        int[] a4 = {3,2,1};
        Assert.assertArrayEquals(a1, run(3, 0));
        Assert.assertArrayEquals(a2, run(3, 2));
        Assert.assertArrayEquals(a3, run(3, 3));
        Assert.assertArrayEquals(a4, run(3, 5));
    }

}
