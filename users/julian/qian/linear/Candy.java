package julian.qian.linear;

import static org.junit.Assert.fail;

import org.junit.Test;
/*
 * There are N children standing in a line. Each child is assigned a rating value.
You are giving candies to these children subjected to the following requirements:
• Each child must have at least one candy.
• Children with a higher rating get more candies than their neighbors.
 */
public class Candy {
    public static int run(int[] a) {
        int n = a.length;
        if (n==1) return 1;
        int[] s = new int[n];
        // 左右扫描，保存需要的最大值，
        for (int i = 1, inc = 1; i < n; i++) {
            if(a[i] > a[i-1]) {
                s[i] = Math.max(inc, s[i]);
                inc++;
            } else {
                inc = 1;
            }
        }
        for(int i = n-2,inc = 1; i >= 0; --i) {
            if (a[i]>a[i+1]) {
                s[i] = Math.max(inc, s[i]);
                inc++;
            } else {
                inc = 1;
            }
        }
        int sum = n;
        for (int i:s) {
           sum+=i; 
        }
        return sum;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
