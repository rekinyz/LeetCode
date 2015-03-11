package dp;
import junit.framework.Assert;

import org.junit.Test;


public class MaximalRectangle {
    public static int run(char[][] m) {
        int max = 0;
        return max;
    }
    
    @Test
    public void test() {
        char[][] a = {
                {'1', '0', '1', '1', '1'},
                {'1', '0', '1', '1', '0'},
                {'0', '0', '1', '1', '1'},
                {'1', '0', '1', '0', '1'},
            };
        Assert.assertEquals(6, run(a));
    }

}
