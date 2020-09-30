package julian.qian.linear;

import static org.junit.Assert.fail;

import org.junit.Test;
/*
 * Given a m  n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
Follow up: Did you use extra space?
A straight forward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?
 */
public class SetMatrixZeros {
    public static void run(int[][] mx) {
        int m = mx.length;
        int n = mx[0].length;
        boolean rowHasZero = false;
        boolean colHasZero = false;
        for(int i = 0; i < n; i++) {
            if (mx[0][i] == 0) {
                rowHasZero = true;
                break;
            }
        }
        for(int i = 0; i < m; i++) {
            if (mx[i][0] == 0) {
                colHasZero = true;
                break;
            }
        }
        for(int i = 1; i<m; i++) {
            for(int j = 1; j<n;j++) {
                if (mx[i][j] == 0) {
                    mx[0][j] = 0;
                    mx[i][0] = 0;
                }
            }
        }
        for(int i = 1; i<m; i++) {
            for(int j = 1; j<n;j++) {
                if (mx[0][j] == 0|| mx[i][0]==0) {
                    mx[i][j] = 0;
                }
            }
        }
        if (rowHasZero) {
            for(int i = 0; i < n; i++) {
                mx[0][i] = 0;
            }
        }
        if (colHasZero) {
            for(int i = 0; i < m; i++) {
                mx[i][0] = 0;
            }
        }
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
