package julian.qian.linear;

import com.leetcode.oj.FindMinimumInRotatedSortedArray2Test;
/********************************************************************************** 
* 
* Follow up for "Find Minimum in Rotated Sorted Array":
* What if duplicates are allowed?
* 
* Would this affect the run-time complexity? How and why?
* 
* Suppose a sorted array is rotated at some pivot unknown to you beforehand.
* 
* (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
* 
* Find the minimum element.
* 
* The array may contain duplicates.
*               
**********************************************************************************/
/*
 * Need be very careful for the following cases:
 *
 *    [3, 3, 3, 3, 3]
 *  
 *    [3, 3, 3, 1, 3]
 *
 */

public class FindMinimumInRotatedSortedArray2 extends FindMinimumInRotatedSortedArray2Test {
    @Override
    protected int findMin(int[] num){
        int low = 0, high = num.length - 1;
        while (high-low>1) {
            // skip相等的元素
            while(high-low>1 && num[low]==num[high]) low++;
            int mid = (low + high) >> 1;
            if (num[low] <= num[mid] && num[mid] <= num[high]) return num[low];
            if(num[low]>num[mid]) {
                high = mid;
            } else {
                low = mid;
            }
        }
        // 一个和两个元素的特殊case
        if (high == low) return num[low];
        return Math.min(num[high], num[low]);
    }
}
