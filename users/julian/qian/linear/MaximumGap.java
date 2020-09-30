package julian.qian.linear;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
/********************************************************************************** 
* 
* Given an unsorted array, find the maximum difference between the successive elements in its sorted form.
* 
* Try to solve it in linear time/space.
* 
* Return 0 if the array contains less than 2 elements.
* 
* You may assume all elements in the array are non-negative integers and fit in the 32-bit signed integer range.
* 
* Credits:Special thanks to @porker2008 for adding this problem and creating all test cases.
*               
**********************************************************************************/
public class MaximumGap {
    public static int run(int[] n) {
        if (n.length < 2) return 0;
        int min = n[0], max = n[0];
        for (int i : n) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        //n个元素，用n+1个bucket来放，这样，一定有一个bucket是空，这样最大的gap长度就必然至少一个bucket的长度
        //所以在每个buket里面找到最大，最小值，这个最大最小值的序列的最大间距，就是最大gap
        // 如果 max-min 小于 n+11, 也还是设立 n+1个bucket, bucket大小至少1，
        // 如何确定x在哪个bucket: （x-min)/size 就是 bucket的idx.
        // size = (max-min)/(bucketNum) + 1
        int bucketNum = n.length + 1;
        int h = max-min;
        int bucketSize = h/bucketNum + ((h % bucketNum) > 0?1:0);
        // 最少1个bucket，
        List<List<Integer>> buckets = new ArrayList<List<Integer>>(bucketNum);
        for (int i = 0; i < bucketNum; ++i) {
            buckets.add(new ArrayList<Integer>());
        }
        for (int i :n) {
            int bucketIdx = (i-min) / bucketSize;
            List<Integer> b = buckets.get(bucketIdx);
            if (b.isEmpty()) {
                b.add(i);
                b.add(i);
            } else {
                b.set(0, Math.min(i, b.get(0)));
                b.set(1, Math.max(i, b.get(1)));                
            }
        }
        int gap = 0;
        int prev = 0;
        for (int i = 1; i < bucketNum; ++i) {
            List<Integer> b = buckets.get(i);
            if (b.isEmpty()) continue;
            List<Integer> c = buckets.get(prev);
            int g = b.get(0) - c.get(1);
            prev = i;
            gap = Math.max(gap, g);
        }
        return gap;
    }
    @Test
    public void test() {
        Assert.assertEquals(4, run(new int[]{1,1,1,1,1,5,5,5,5,5}));
        Assert.assertEquals(13, run(new int[]{3, 6, 19, 1}));
    }

}
