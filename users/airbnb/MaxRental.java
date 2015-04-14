package airbnb;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Test;
/*
 * 不相邻的range 求和最大 [check-in date, check-out date/ check-in date, check-out date/ check-in date,….]
 * 求最多能租出去几天。
 * 用check-in date排序
 */
public class MaxRental {
    public static class Rental implements Comparable<Rental>{
        public int in;
        public int out;
        public int value() {
            return out-in;
        }
        public Rental(int in, int out) {
            this.in = in;
            this.out = out;
        }
        // 按照入住日期排序，如果入住日期相同，按离开日期排序
        @Override
        public int compareTo(Rental o) {
            if (o == this) {
                return 0;
            } else if (in == o.in) {
                return out - o.out;
            } else {
                return in - o.in;
            }
        }
        @Override
        public String toString() {
            return String.valueOf(in) + " " + String.valueOf(out);
        }
    }
    // 到p这个天数的时候目前的最大出租天数
    // 如果p找不到，就用之前的最大天数。
    public static int findAndSetMax(int[] m, int p) {
        if (m[p] != 0) return m[p];
        for (int i = p-1; i>=0; i--) {
            if (m[i] != 0) {
                m[p] = m[i];
                return m[p];
            }
        }
        return 0;
    }

    public static int run(Rental[] r) {
        if (r.length == 0) return 0;
        Arrays.sort(r);
        System.out.println(Arrays.toString(r));
        // 记录0~这一天的最大出租天数
        int[] max = new int[365];
        int last_pos=0;
        for (int i = 0; i < r.length; ++i) {
            Rental a = r[i];
            int maxIn = findAndSetMax(max, a.in);
            int maxOut = findAndSetMax(max, a.out);
            //新的包括这个的最大天数是 到入住前的最大天数 + 本预订的长度
            int newMaxOut = maxIn + a.value();
            // 如果比已有的maxOut大，需要更新
            if (newMaxOut > maxOut) {
                max[a.out] = newMaxOut;
            }
            last_pos = Math.max(last_pos, a.out);
        }
        return max[last_pos];
    }
    // 由于 rental是排序的，设定上一个有数值的点，如果 p比这个点大，可以直接用这个点来优化，
    // 不过由于是有in out两个日期，很可能in比上一个out小，这样就没法用来优化
    public static int run2(Rental[] r) {
        if (r.length == 0) return 0;
        Arrays.sort(r);
        System.out.println(Arrays.toString(r));
        // 记录0~这一天的最大出租天数
        int last_in = 0, last_out=0, last_out_pos=0;
        for (int i = 0; i < r.length; ++i) {
            Rental a = r[i];
            //新的包括这个的最大天数是 到入住前的最大天数 + 本预订的长度
            // 如果比已有的maxOut大，需要更新, run2是错的，因为 下面这行错了，last_in 可能和更之前的比较，不是和直接上个比较
            // 0 3， 2 7， 6 8 这个里面， 6进来，需要取得是03，不是 27，所以不能不记录之前更多的数据
            last_in = a.in >=last_out_pos ? last_out:last_in;
            int newMaxOut = last_in + a.value();
            last_out = Math.max(newMaxOut, last_out);
            last_out_pos = a.out;
        }
        return last_out;
    }
    @Test
    public void test() {
        // greedy solution is not the best solution
        Rental[] r = {new Rental(6, 8),new Rental(0, 3),new Rental(2, 7),new Rental(7, 17)};
        Assert.assertEquals(15, run(r));
        // assumption: 0 ~365，only digit, 
        // multi same in
        Assert.assertEquals(17, run(new Rental[]{
                new Rental(6, 8),new Rental(0,1), new Rental(0,2), new Rental(0, 3),new Rental(2, 7),new Rental(7, 17)}));
        // multi out and two solutions
        Assert.assertEquals(17, run(new Rental[]{
                new Rental(6, 8),new Rental(0,8), new Rental(8,17), new Rental(0, 3),new Rental(2, 7),new Rental(7, 17)}));
        // 没有边界的数据
        Assert.assertEquals(13, run(new Rental[]{
                new Rental(6, 8),new Rental(4,8), new Rental(8,15), new Rental(1, 3),new Rental(2, 7),new Rental(7, 14)}));
        // 极大的数据+边界的数据，最后in的out 不是最后的out
        Assert.assertEquals(362, run(new Rental[]{
                new Rental(6, 8),new Rental(0,8), new Rental(8,17), new Rental(0, 3),new Rental(2, 7),new Rental(7, 364)}));
        //Assert.assertEquals(15, run2(r));
    }

}
