package uber;

import junit.framework.Assert;

import org.junit.Test;
// BUG: 1, 忘记 binary search, 只一味减小
// a 给 0 是exception, 所以K的初值可以是 1
// s 有可能 = k， 就是 s = e - 1；
// 和binary search不同，binary search,return 找不到就ok，所以可以s = k+1;
public class Sqrt {
    // TODO this has bug, but may run faster.
    public static int sqrt(int x)
    {
        int test, step;
        if(x < 0)
            return-1;
        if(x == 0)
            return 0;
        step= 1<<15;
        test= 0;
        while(step != 0)
        {
            int h;
            h= (test + step) * (test + step);
            if (h <= x)
                test += step;
            if (h == x)
                break;
            step>>= 1;
        }    //至此，已找到比根号下x小的最接近根号下x的值。
        if(x-test*test<=(test+1)*(test+1)-x)    //此步骤判断test还是test+1更接近根号下x
            return test;
        else
            return test+1;
    }
    private static int sqrt(int x, int p, int q) {
        if (p > q)
            return q;
        int mid = (p + q) / 2;
        if (x / mid == mid)
            return mid;
        else if (x / mid < mid )
            return sqrt(x, p, mid - 1);
        else
            return sqrt(x, mid + 1, q);
    }
    public static int run(int a) {
        //return sqrt(a, 1, a);
        int s = 1;
        int e = a;
     // BUG: e > s 不对，二分的模板循环条件永远是end >= start 
        // 配合 e = mid-1 s= mid+1, return end
        while(e >= s) { 
            int mid = (s+e)/2;
            int r = mid*mid;
            if (r == a) {
                return mid;
            } else if (r > a) {
                e = mid-1;
            } else {
                s = mid+1;
            }
        }
        return e;
    }
    @Test
    public void test() {
        Assert.assertEquals(1, run(1));
        Assert.assertEquals(1, run(2));
        Assert.assertEquals(1, run(3));
        Assert.assertEquals(2, run(4));
        Assert.assertEquals(4, run(16));
        Assert.assertEquals(10, run(101));
        Assert.assertEquals(100, run(10001));
    }

}
