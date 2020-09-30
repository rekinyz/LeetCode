package julian.qian.linear;

import com.leetcode.oj.SingleNumber2Test;
/*
 * Given an array of integers, every element appears three times except for one. Find that single one.
 * 方法1：把重复3次的数都去掉，剩下就是只出现一次的那个了，可以按位来去掉，每位%3，就去掉了
 * 
 * 创建一个长度为sizeof(int) 的数组count[sizeof(int)]，count[i] 表示在在i 位
出现的1 的次数。如果count[i] 是3 的整数倍，则忽略；否则就把该位取出来组成答案。


方法2：用one 记录到当前处理的元素为止，二进制1 出现“1 次”（mod 3 之后的1）的有哪
些二进制位；用two 记录到当前计算的变量为止，二进制1 出现“2 次”（mod 3 之后的2）的有哪
些二进制位。当one 和two 中的某一位同时为1 时表示该二进制位上1 出现了3 次，此时需要清
零。即用二进制模拟三进制运算。最终one 记录的是最终结果。
 */
public class SingleNumber2 extends SingleNumber2Test {
	@Override
    public int singleNumber(int[] a) {
	    int[] c = new int[32];// java int is always 32bit
	    for (int i = 0; i < a.length; i++){
	        for(int j = 0; j < c.length; j++) {
	            c[j] += (a[i]>>j) & 1;
	        }
	    }

	    for(int j = 0; j < c.length; j++) {
            c[j] %=3;
        }
	    
	    int r = 0;
	    for (int i = 0; i < c.length; i++){
	        r += (c[i]<<i);
	    }
	    return r;
	}
}
