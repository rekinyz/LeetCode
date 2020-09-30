package search;

import static org.junit.Assert.fail;

import org.junit.Test;

public class Search2DMatrix {
    public static boolean run(int[][] m, int t) {
        int i = m.length;
        int j = m[0].length;
        int first = 0;
        int last = i*j;
        while(first < last) {
            int mid = (first + last) / 2;
            int value = m[mid/j][mid%j];
            if (value == t) return true;
            else if (value < t) first = mid + 1;
            else last = mid-1;// should be -1?
        }
        return false;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
