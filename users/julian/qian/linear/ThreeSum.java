package julian.qian.linear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.leetcode.oj.ThreeSumTest;

public class ThreeSum extends ThreeSumTest {

    protected List<List<Integer>> threeSum(int[] num, int target) {
        Arrays.sort(num);
        List<List<Integer>> r = new ArrayList<List<Integer>>();
        
        for(int i = 0; i < num.length - 2; ++i) {
            int j = i + 1;
            if (i > 0 && num[i] == num[i-1]) continue; // dup number will not be counted.?
            int k = num.length - 1;
            while(j < k) {
                int sum = num[i] + num[j] + num[k];
                if (sum < target) {
                    ++j;
                    while(num[j] == num[j-1] && j < k) ++j;
                } else if (sum > target) {
                    --k;
                    while(num[k] == num[k+1] && j < k) --k;
                } else {
                    r.add(Arrays.asList(num[i], num[j], num[k]));
                    ++j;
                    --k;
                    while(num[j] == num[j-1] && num[k] == num[k+1] && j < k) {
                        ++j;
                        --k;
                    }
                }
            }
        }
        return r;
    }
    
    @Override
    protected List<List<Integer>> threeSum(int[] num) {
        return threeSum(num, 0);
    }

}
