package force;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
/*
 * 用path存已经选择的，判断如何进入下一步和如何终止
 */
public class Combinations {
    public static List<List<Integer>> dfs(int n, int k) {
        List<List<Integer>> r = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        dfs(n, k, 1, 0, path, r);
        return r;
    }

    public static void dfs(int n, int k, int start, int selected, List<Integer> path,
            List<List<Integer>> r) {
        if (selected == k) {
            r.add(new ArrayList<Integer>(path));
        } else {
            for (int i = start; i <= n; ++i) {
                path.add(i);
                dfs(n, k, i + 1, selected + 1, path, r);
                path.remove(path.size() - 1);
            }
        }
    }

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
