package airbnb;

import org.junit.Assert;
import org.junit.Test;
/*要求： 输入一个数组（未排序），输出数组要保证每一个一个数字要比它左右相邻的数字都小或者都大，类似ABABAB的格式。*/
public class ABAB {
    public static void swap(int[] a, int p) {
        int x = a[p];
        a[p] = a[p+1];
        a[p+1]= x;
    }
    public static int[] run(int[] a) {
        boolean up = true;
        for (int i = 0; i < a.length-1; ++i){
            if (up) {
                if (a[i] > a[i+1]) {
                    swap(a, i);
                }
            } else {
                if (a[i] < a[i+1]) {
                    swap(a, i);
                }
            }
            up = !up;
        }
        return a;
    }
    @Test
    public void test() {
        int[] a = {1,2,3,4,5,6,7,8};
        int[] b = {1,3,2,5,4,7,6,8};
        Assert.assertArrayEquals(b, run(a));
    }

}
