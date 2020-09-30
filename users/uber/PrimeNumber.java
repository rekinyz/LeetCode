package uber;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
/*
 * http://program-think.blogspot.com/2011/12/prime-algorithm-1.html
 * 2 以外的偶数，x/2, sqrt(x), only try prime number between 2~sqrt(x)
 * 可以用一个bit数组来表示N，然后从2开始排除2的倍数，剩下的第一个就是，prime number,以此类推
 */
public class PrimeNumber {
    public static int byteLength(int n) {
        int left = (n%8) != 0?1:0;
        return n/8 + left; // !=的优先级低，一定用（）保护，或分行
    }
    public static int bitShift(int n) {
        int p = n % 8;
        if (p == 0) p = 8;
        int x = 1 << p - 1;
        return x;
    }
    public static List<Integer> run(int n) {
        List<Integer> r = new ArrayList<Integer>();
        if (n<=1) return r;
        
        r.add(2);
        if (n==2) {
            return r;
        }
        byte[] b = new byte[byteLength(n)];
        b[0] = 3; // 00000011
        int pos = 2;
        while (pos < n) {
            // update b[]
            for (int i = 2*pos; i < n; i+=pos) {
                int bytePos = byteLength(i) - 1;
                b[bytePos] |= bitShift(i);
            }
            // find next pos; 可以一个字节 FF来优化
            for (pos++;pos < n; ++pos) {
                int bytePos = byteLength(pos) - 1;
                if ((b[bytePos] & bitShift(pos))==0) {
                    r.add(pos);
                    break;
                }
            }
        }
        return r;
    }
    @Test
    public void test() {
        Assert.assertEquals(1, byteLength(1));
        Assert.assertEquals(1, byteLength(8));
        Assert.assertEquals(2, byteLength(9));
        Assert.assertEquals(2, byteLength(16));
        Assert.assertEquals(1, bitShift(1));
        Assert.assertEquals(4, bitShift(3));
        Assert.assertEquals(128, bitShift(8));
        Assert.assertEquals(1, bitShift(9));
        List<Integer> r = run(100);
        System.out.println(r);
    }

}
