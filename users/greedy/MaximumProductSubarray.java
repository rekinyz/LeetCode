package greedy;

import com.leetcode.oj.MaximumProductSubarrayTest;

/********************************************************************************** 
* 
* Find the contiguous subarray within an array (containing at least one number) 
* which has the largest product.
* 
* For example, given the array [2,3,-2,4],
* the contiguous subarray [2,3] has the largest product = 6.
* 
* More examples:
*   
*   Input: arr[] = {6, -3, -10, 0, 2}
*   Output:   180  // The subarray is {6, -3, -10}
*   
*   Input: arr[] = {-1, -3, -10, 0, 60}
*   Output:   60  // The subarray is {60}
*   
*   Input: arr[] = {-2, -3, 0, -2, -40}
*   Output:   80  // The subarray is {-2, -40}
*               
**********************************************************************************/
//The idea is similar with "Find the subarray wich has the largest sum"
//(See: http://en.wikipedia.org/wiki/Maximum_subarray_problem)
//
//The only thing to note here is, maximum product can also be obtained by minimum (negative) product 
//ending with the previous element multiplied by this element. For example, in array {12, 2, -3, -5, -6, -2}, 
//when we are at element -2, the maximum product is multiplication of, minimum product ending with -6 and -2.
// 问如果少于2个元素如何处理？       int[] num = { -3, 0, 1, -2 };

public class MaximumProductSubarray extends MaximumProductSubarrayTest {
    @Override
    protected int maxProduct(int[] a){
        if (a.length == 0) return 0;
        // 因为有负数，所以要保存min
        int maxPrev = a[0], minPrev = a[0];
        int maxHere = a[0], minHere = a[0];
        int maxProd = a[0];
        for (int j = 1; j < a.length; ++j) {
            int i = a[j];
            maxHere = Math.max(Math.max(maxPrev * i, minPrev*i), i);
            minHere = Math.min(Math.min(maxPrev * i, minPrev*i), i);
            maxProd = Math.max(maxHere, maxProd);
            maxPrev = maxHere;
            minPrev = minHere;
        }
        return maxProd;
    }
}
