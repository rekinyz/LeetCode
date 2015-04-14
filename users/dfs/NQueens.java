package dfs;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class NQueens {
    private static int[] columns;// 表示已经放置的皇后占据了哪些列
    private static int[] main_diag;// 占据了哪些主对角线
    private static int[] anti_diag;// 占据了哪些副对角线
    
    public static List<List<Integer>> solve(int n) {
        columns = new int[n];
        main_diag = new int[2*n];
        anti_diag = new int[2*n];
        
        List<List<Integer>> r = new ArrayList<List<Integer>>();
        Integer[] path = new Integer[n];
        //
        dfs(path, r, 0);
        return r;
    }
    public static void dfs(Integer[] path, List<List<Integer>> r, int row) {
        int n = path.length;
        if (row == n){
            r.add(Arrays.asList(path.clone()));
            return;
        }
        for (int j = 0; j<n; ++j) {
            // row, j is ok
            boolean ok = columns[j] == 0 && main_diag[row + j] == 0 &&
                    anti_diag[n-j+row] == 0;
            if (!ok) continue;
            path[row] = j;
            columns[j] = main_diag[row + j] = anti_diag[n-j+row] = 1;
            dfs(path, r, row +1);
            path[row] = 0;
            columns[j] = main_diag[row + j] = anti_diag[n-j+row] = 0;
            
        }
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
