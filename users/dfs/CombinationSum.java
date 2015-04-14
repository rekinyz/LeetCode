package dfs;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CombinationSum {
    static List<List<Integer>> unlimited(int[] nums, int t) {
        Arrays.sort(nums);
        List<List<Integer>> r = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        dfsUnlimited(nums, t, 0, path, r);
        return r;
    }
    public static void dfsUnlimited(int[] nums, int gap, int start, List<Integer> path,
            List<List<Integer>> r) {
        if (gap==0) {
            r.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i = start; i < nums.length; ++i) {
            if (gap < nums[i]) return;
            path.add(nums[i]);
            // i not increase, so it is unlimited
            dfsUnlimited(nums, gap-nums[i], i, path, r);
            path.remove(path.size()-1);
        }
    }
    /*
     * limited one number can only be used once
     */
    public static void dfs(int[] nums, int gap, int start, List<Integer> path,
            List<List<Integer>> r) {
        if (gap==0) {
            r.add(new ArrayList<Integer>(path));
            return;
        }
        // 这是保证 如果 nums 里面有重复的数，1,1,2,7,6,1,5, 不会被重用
        int previous = -1;
        for (int i = start; i < nums.length; ++i) {
            if (previous == nums[i]) continue;
            if (gap < nums[i]) return;
            previous = nums[i];
            path.add(nums[i]);
            dfsUnlimited(nums, gap-nums[i], i+1, path, r);
            path.remove(path.size()-1);
        }
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
