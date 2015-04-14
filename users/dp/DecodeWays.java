package dp;

import org.junit.Test;
/*
 * question to ask is
 * 1200 is this return 0 or return 3?  这个算法是错得，应该写过正确的
 */
public class DecodeWays {
    public static int run(String s) {
        if(s.isEmpty() || s.charAt(0) == '0') return 0;
        int prev = 0, cur = 1;
        for (int i = 1; i <= s.length(); ++i) {
            if(s.charAt(i-1)=='0') {
                // 1202
                cur = 0;
            }
            if (i<2 || !(s.charAt(i-2)=='1' ||(s.charAt(i-2)=='2' && s.charAt(i-2) <='6'))){
                prev = 0;
            }
            int tmp = cur;
            cur = prev+cur;
            prev = tmp;
        }
        return cur;
    }
    @Test
    public void test() {
        System.out.format(" %d \r\n", run("1200"));
        System.out.format(" %d \r\n", run("12012"));
        System.out.format(" %d \r\n", run("1227"));
        System.out.format(" %d \r\n", run("1238"));
    }

}
