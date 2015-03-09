package julian.qian.linear;

import java.util.HashMap;

public class TwoSum extends com.leetcode.oj.TwoSumTest{

    // does it allow dup in numbers? if not, then easy:
    @Override
    protected int[] twoSum(int[] numbers, int target){
        int[] r = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i =0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }
        for (int i =0; i < numbers.length; i++) {
            int t = target - numbers[i];
            Integer p = map.get(t);
            if(p != null && p > i) { // p > i means no dup items
                r[0] = i+1;
                r[1] = p+1;
                break;
            }
        }        
        return r;
    }

}
