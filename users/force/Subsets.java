package force;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.leetcode.oj.SubsetsTest;

public class Subsets extends SubsetsTest {
    @Override
    protected List<List<Integer>> subsets(int[] s) {
        Arrays.sort(s);
        List<List<Integer>> set = new ArrayList<List<Integer>>();
        int size = s.length;
        int max = 1 << size;
        for (int i = 0; i < max; i++) {
            int k = i;
            List<Integer> subset = new ArrayList<Integer>();
            for (int j = 0; j < size; ++j) {
                if ((k & 1) > 0) {
                    subset.add(s[j]);
                }
                k >>= 1;
            }
            set.add(subset);
        }
        return set;
    }

    /*
     * Given a collection of integers that might contain duplicates, S, return
     * all possible subsets. Note: Elements in a subset must be in
     * non-descending order. The solution set must not contain duplicate
     * subsets. For example, If S = [1,2,2], a solution is: [ [2], [1], [1,2,2],
     * [2,2], [1,2], [] ] 排序后，就不用考虑 122 和 212和221， 可以用string
     * 的hash来作为hash去重，用一个hashset来去重就ok了
     */
    protected List<List<Integer>> subsetsAllowDup(int[] s) {
        Arrays.sort(s);
        List<List<Integer>> set = new ArrayList<List<Integer>>();
        int size = s.length;
        int max = 1 << size;
        for (int i = 0; i < max; i++) {
        }
        return set;
    }
}
