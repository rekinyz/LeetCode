package julian.qian.linear;

import com.leetcode.oj.FindMinimumInRotatedSortedArrayTest;
/********************************************************************************** 
* 
* Suppose a sorted array is rotated at some pivot unknown to you beforehand.
* 
* (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
* 
* Find the minimum element.
* 
* You may assume no duplicate exists in the array.
*               
**********************************************************************************/

public class FindMinimumInRotatedSortedArray extends FindMinimumInRotatedSortedArrayTest {

    @Override
    protected int findMin(int[] num){
        int low = 0, high = num.length - 1;
        while(high-low>1) {
            int mid = (low + high) >> 1;
            // this is not rotated
            if (num[low] < num[mid] & num[mid] < num[high]) return num[low];
            
            // 最小值在 low mid之间
            if (num[low] > num [mid]) {
                high = mid; //不用+1，因为不知道high mid谁小
            } else {
                low = mid;
            }
        }
        
        if (high == low) return num[low];
        return Math.min(num[high], num[low]);
    }

}
