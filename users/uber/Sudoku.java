package uber;

import junit.framework.Assert;

import org.junit.Test;
/*
 * page 178 10.10
 */
public class Sudoku {
    public static int[][] s;
    public static boolean run() {
        for (int i = 0; i < s.length; ++i) {
            for (int j=0; j < s.length; ++j) {
                if (s[i][j] == 0) {
                    boolean[] r = validNum(i,j);
                    for (int k = 1; k<=r.length;++k) {
                        if (!r[k]) {
                            // try with new value
                            s[i][j] = k;
                            if (run()) return true;
                            s[i][j] = 0;
                            // revert it back
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean[] validNum(int i, int j) {
        boolean[] r = new boolean[9];
        for (int k = 0; k < 9; ++k) {
            if (s[i][k] != 0) {
                r[s[i][k]-1] = true;
            }
        }
        for (int k = 0; k < 9; ++k) {
            if (s[k][j] != 0) {
                r[s[k][j]-1] = true;
            }
        }
        return r;
    }

    @Test
    public void test() {
        int[][] grid = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};
        Sudoku.s = grid;
        Assert.assertEquals(true, run());
    }

}
