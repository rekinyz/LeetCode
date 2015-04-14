package QueueStack;

import junit.framework.Assert;

import org.junit.Test;

public class LongestValidParentheses {
    public static int run(String p) {
        int max=0, maxCurrent=0;
        int left = 0;
        
        for (int i = 0; i < p.length();++i) {
            char c = p.charAt(i);
            if (c == ')') {
                if (left == 0) {
                    max = Math.max(max, maxCurrent);
                    maxCurrent = 0;
                } else {
                    left--;
                    maxCurrent += 2;
                }
            } else {
                left++;
            }
        }
        return Math.max(max, maxCurrent);
    }
    @Test
    public void test() {
        Assert.assertEquals(2, run("(()"));
        Assert.assertEquals(4, run(")()())"));
        Assert.assertEquals(2, run(")())())"));
        Assert.assertEquals(6, run(")()(())"));
        Assert.assertEquals(4, run("))()())"));
        Assert.assertEquals(6, run(")()(())))"));
        Assert.assertEquals(2, run(")()))())"));
        Assert.assertEquals(0, run(""));
        Assert.assertEquals(0, run("("));
        Assert.assertEquals(0, run(")"));
    }

}
