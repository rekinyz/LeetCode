package uber;

import junit.framework.Assert;

import org.junit.Test;

public class Fibonacci {
    // A encode to 1,B encode to 2,Z encode to 26,
    // 32 can be decode to CB, 26 can be decode to Z or BF
    // given a string of number, return how many ways to decode.
    // http://blog.csdn.net/swagle/article/details/30231807
    // dp[i] = { (s[i-1]!='0')?dp[i-1]:0 } + { s[i-2...i-1]<='26' ? dp[i-2] : 0 } ;
    public static int coding(String s) {
        if (s.charAt(0) <= '0') return 0;
        if (s.length() == 1) {
            return 1;
        }
        int d1 = 1, d2 = 1, d = 0;
        for (int i = 1; i < s.length(); ++i) {
            int c1 = (s.charAt(i) - '0');
            int c2 = (s.charAt(i-1) - '0');
            int c3 = (c2*10 + c1);
            if (c3 == 0 || (c3 >= 30 && (c3 %10 == 0))) {
                return 0;
            }
            d = ((c1 != 0)?d1:0) + 
                ((c3 <= 26)?d2:0);
            d2 = d1;
            d1 = d;
        }
        return d;
    }
    public static int fibSlow(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        return fibSlow(n-1) + fibSlow(n-2);
    }
    public static int fib(int n) {
        if (n <= 1) return 0;
        if (n == 2) return 1;
        int f1 = 1, f2 = 0, f = 0;
        for (int i = 3; i <= n; ++i) {
            f = f1 + f2;
            f2 = f1;
            f1 = f;
        }
        return f;
    }
    @Test
    public void test() {
        Assert.assertEquals(0, coding("270"));
        Assert.assertEquals(0, coding("200"));
        Assert.assertEquals(1, coding("2"));
        Assert.assertEquals(2, coding("21"));
        Assert.assertEquals(3, coding("212"));
        Assert.assertEquals(2, coding("2120"));
        for (int i = 1; i < 20; ++i) {
            int f = fib(i);
            int s = fibSlow(i);
            System.out.format("%d f %d, s %d\r\n", i, f, s);
            Assert.assertEquals(f, s);
        }
    }

}
