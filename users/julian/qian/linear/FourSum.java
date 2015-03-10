package julian.qian.linear;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.leetcode.oj.FourSumTest;


public class FourSum extends FourSumTest {

    @Override
    protected List<List<Integer>> fourSum(int[] num, int target) {
        Arrays.sort(num);
        List<List<Integer>> r = new ArrayList<List<Integer>>();
        HashMap<Integer, List<int[]>> c = new HashMap<Integer, List<int[]>>(num.length*10);
        for (int i = 0; i < num.length-1; ++i) {
            for (int j = i+1; j < num.length; ++ j) {
                int[] b = {i, j};
                int s = num[i] + num[j];
                List<int[]> a = c.get(s);
                if (a == null) {
                    a = new ArrayList<int[]>();
                }
                a.add(b);
                c.put(s, a);
            }
        } 
        
        for (int i = 0; i < num.length-1; ++i) {
            for(int j = i + 1; j < num.length; ++j) {
                int s = num[i] + num[j];
                int a = target - s;
                List<int[]> x = c.get(a);
                if (x != null) {
                    for (int[] k : x) {
                        if (i <= k[1]) continue; // not add the other half which will be dup
                        List<Integer> il = Arrays.asList(num[k[0]],num[k[1]],num[i],num[j]);
                        r.add(il);
                    }
                }
            }
        }
        return r;
    }

}
