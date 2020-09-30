package julian.qian.linear;

import java.util.Arrays;
import java.util.Comparator;

import junit.framework.Assert;

import org.junit.Test;
/********************************************************************************** 
 * 
 * Given a list of non negative integers, arrange them such that they form the largest number.
 * 
 * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 * 
 * Note: The result may be very large, so you need to return a string instead of an integer.
 * 
 * Credits:Special thanks to @ts for adding this problem and creating all test cases.
 *               
 **********************************************************************************/
// 问题，如果第一个数是 0 如何处理？
public class LargestNumber {
    public static class cp implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            // 不然需要 append时候从后append
            return (o2+o1).compareTo(o1 + o2);
        }
        
    }
    public static String run(String[] n) {
        Arrays.sort(n, new  cp());
        StringBuilder sb = new StringBuilder();
        for (String a : n) {
            sb.append(a);
        }
        
        return sb.toString();
    }
    @Test
    public void test() {
        Assert.assertEquals("9534330", run(new String[]{"3", "30", "34", "5", "9"}));
    }

}
