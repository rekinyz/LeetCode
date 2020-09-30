package julian.qian.linear;

import java.util.Arrays;

import com.leetcode.oj.ThreeSumClosestTest;

public class ThreeSumClose extends ThreeSumClosestTest {

    @Override
    protected int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int r = 0;
        int mingap = Integer.MAX_VALUE;
        for(int i = 0; i < num.length - 2; ++i) {
            int j = i + 1;
            int k = num.length - 1;
            while(j < k) {
                int sum = num[i] + num[j] + num[k];
                int gap = Math.abs(sum - target);
                if (mingap > gap) {
                    r = sum;
                    mingap = gap;
                }
                
                if (sum < target) ++j;
                else --k;
            }
        }
        return r;

    }

}
