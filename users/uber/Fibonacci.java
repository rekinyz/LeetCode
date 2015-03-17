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
        return 0;
    }
    @Test
    public void test() {
        Assert.assertEquals(0, "200");
        Assert.assertEquals(1, "2");
        Assert.assertEquals(2, "21");
        Assert.assertEquals(3, "212");
        Assert.assertEquals(2, "2120");
    }

}
