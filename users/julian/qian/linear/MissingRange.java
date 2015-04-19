package julian.qian.linear;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MissingRange {
    /********************************************************************************** 
     * 
     * Given a sorted integer array where the range of elements are [lower, upper] inclusive, 
     * return its missing ranges.
     *
     * For example, given [0, 1, 3, 50, 75], lower = 0 and upper = 99, 
     * return ["2", "4->49", "51->74", "76->99"]. 
     * 
     **********************************************************************************/
    public static String range(int lo, int hi) {
        StringBuilder sb = new StringBuilder();
        sb.append(lo);
        if (lo != hi) {
            sb.append("->").append(hi);
        }
        return sb.toString();
    }
    public static List<String> run(int[] n, int lo, int hi) {
        List<String> r = new ArrayList<String>();
        if (n.length == 0) {
            r.add(range(lo, hi));
            return r;
        }
        if (lo < n[0]) {
            r.add(range(lo, n[0]));
        }
        for ( int i = 0; i < n.length-1; ++i) {
            if (n[i] + 1 == n[i+1]) continue;
            r.add(range(n[i]+1, n[i+1]-1));
        }
        if (hi > n[n.length-1]) {
            r.add(range(n[n.length-1]+1, hi));
        }
        return r;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
