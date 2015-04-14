package search;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Test;
/*
 * unlike c++ lower_bound,
 * java binarysearch has no guarantee of position it finds.
 */
public class SearchForARange {
    public static int[] run(int[] a, int t) {
        int l = Arrays.binarySearch(a, t);
        //System.out.format("%d\r\n", l);
        return new int[]{-1,-1};
    }
    /* 
     * both upper and lower 都不一定有，但是用lower比较，就一定有，
     * 这样就可以用upper -1
     */
    public static int[] range(int[] a, int t) {
        int lower = lower_bound(a, 0, a.length, t);
        if (lower == a.length || a[lower] != t) return new int[]{-1,-1};
        int upper = upper_bound(a, lower, a.length, t);
        return new int[]{lower, upper-1};
        
    }
    public static int lower_bound(int[] a, int start, int end, int t) {
        while (start != end) {
            int mid = (start + end) / 2;
            if (t > a[mid]) {
                start = mid + 1;
            } else { // 如果==，不能算找到，需要找到最后一个小于的数，之前就是，条件就是start = mid + 1
                     // 且start已经==end
                     // 或者，start比end大一，这时候一定比较start这个位置，如果小于或==,
                    // 这个时候return的位置，可能不等于 t,需要比较
                end = mid;
            }
        }
        return start;
    }
    /*
     * 参考例子，upper 的前一个可能==t
     */
    public static int upper_bound(int[] a, int start, int end, int t) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (t >= a[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
    @Test
    public void test() {
        run(new int[]{5, 7, 7, 8, 8, 10}, 8);
        run(new int[]{5, 7, 8, 8, 8, 10}, 8);
        run(new int[]{5, 8, 8, 8, 8, 10}, 8);
        run(new int[]{5, 8, 8, 8, 8, 8}, 8);
        run(new int[]{8, 8, 8, 8, 8, 8}, 8);
    }
    @Test
    public void testLower() {
        Assert.assertEquals(3,lower_bound(new int[]{5, 7, 7, 8, 8, 10}, 0, 6,8));
        Assert.assertEquals(2,lower_bound(new int[]{5, 7, 8, 8, 8, 10}, 0, 6,8));
        Assert.assertEquals(1,lower_bound(new int[]{5, 8, 8, 8, 8, 10}, 0, 6,8));
        Assert.assertEquals(1,lower_bound(new int[]{5, 8, 8, 8, 8, 8}, 0, 6,8));
        Assert.assertEquals(0,lower_bound(new int[]{8, 8, 8, 8, 8, 8}, 0, 6,8));
        // return value ！= t的测试用例
        Assert.assertEquals(1,lower_bound(new int[]{7}, 0, 1,8));
    }
    @Test
    public void testUpper() {
        Assert.assertEquals(5,upper_bound(new int[]{5, 7, 7, 8, 8, 10}, 0, 6,8));
        Assert.assertEquals(6,upper_bound(new int[]{5, 7, 8, 8, 8, 8}, 0, 6,8));
        // return value ！= t的测试用例
        Assert.assertEquals(1,upper_bound(new int[]{7}, 0, 1,8));
    }
}
