package airbnb;

import junit.framework.Assert;

import org.junit.Test;

/*
 * 给一个整数数组，求不相互挨着的数字可以想加得到的最大和
 * http://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/
 * Given an array of positive numbers, find the maximum sum of a subsequence with the constraint that no 2 numbers 
 * in the sequence should be adjacent in the array. So 3 2 7 10 should return 13 (sum of 3 and 10) or 3 2 5 10 7 
 * should return 15 (sum of 3, 5 and 7). Answer the question in most efficient way.

  用一个变量记录包括前一个元素的最大值，另一个变量记录不包括前一个元素的最大值,
  每增加一个新元素，包括前一个元素的最大值，等于老的不包括 + 新元素，(假设全是正数）
  不包括前一个元素的最大值=max(老的不包括,老的包括)
  
  如果有负数的情况
  每增加一个新元素，新的包括前一个元素的最大值，等于老的不包括 + 新元素（如果新元素大于0），如果新元素小于0，新的包括=老的不包括

 */
public class ArraySum {
    public static int notAllowNeg(int[] a) {
        int include = 0;
        int exclude = 0;
        for (int i = 0; i < a.length; ++i) {
            // 下一个 include 是 excl
            int old_include = include;
            include = exclude + a[i];
            exclude = Math.max(exclude, old_include);
        }
        return Math.max(include, exclude);
    }

    public static int allowNeg(int[] a) {
        int include = 0;
        int exclude = 0;
        for (int i = 0; i < a.length; ++i) {
            int old_include = include;
            if (a[i]<0) {
                include = Math.max(exclude, include);
            } else {
                include = exclude + a[i];
            }
            exclude = Math.max(exclude, old_include);
        }
        return Math.max(include, exclude);
    }

    @Test
    public void test() {
        Assert.assertEquals(80, notAllowNeg(new int[]{5, 5, 10, 40, 50, 35}));
        Assert.assertEquals(80, allowNeg(new int[]{5, -5, 10, 40, 50, 35}));
        Assert.assertEquals(75, allowNeg(new int[]{-5, -5, 10, 40, 50, 35}));
        Assert.assertEquals(80, allowNeg(new int[]{5, -5, 10, 40, 50, 35, 10, -5}));
    }

}
