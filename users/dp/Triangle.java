package dp;

import static org.junit.Assert.fail;

import org.junit.Test;

public class Triangle {
    public static int min(int[][] t) {
        for (int i = t.length-2; i >=0; --i) {
            for (int j=0; j < i +1 ; ++j) { // i 和 j 长度一致
                t[i][j] += Math.min(t[i+1][j], t[i+1][j+1]); 
            }
        }
        return t[0][0];
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
