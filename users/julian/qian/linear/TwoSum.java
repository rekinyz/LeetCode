package julian.qian.linear;

import java.util.HashMap;
/********************************************************************************** 
* 
* Design and implement a TwoSum class. It should support the following operations: add and find.
* 
* add - Add the number to an internal data structure.
* find - Find if there exists any pair of numbers which sum is equal to the value.
* 
* For example,
*
*   add(1); add(3); add(5);
*   find(4) -> true
*   find(7) -> false
* 
**********************************************************************************/
/********************************************************************************** 
* 
* Given an array of integers that is already sorted in ascending order, 
* find two numbers such that they add up to a specific target number.
* 
* The function twoSum should return indices of the two numbers such that they add up to the target, 
* where index1 must be less than index2. Please note that your returned answers (both index1 and index2) 
* are not zero-based.
* 
* You may assume that each input would have exactly one solution.
* 
* Input: numbers={2, 7, 11, 15}, target=9
* Output: index1=1, index2=2 
* 
**********************************************************************************/

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
    public static int[] twoSumSorted(int[] n, int t) {
        int[] r = new int[2];
        int low = 0, high = n.length -1;
        while(low < high) {
            int v = n[low] + n[high];
            if (v == t) {
                r[0] = n[low];
                r[1] = n[high];
                return r;
            } else if (v > t){
                high--;
            } else {
                low++;
            }
        }
        return r;
    }

}
