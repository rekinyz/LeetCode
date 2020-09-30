package stack;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import junit.framework.Assert;

import org.junit.Test;

public class LargestRectangleInHistogram {
    // 当高度下降，就计算当前的最大值，因为高度一旦下降，就没有可能形成连续高度的rectangle
    // 从目前高度回溯，所有比目前高度高的，都计算。
    // 用stack保存一个递增序列，退栈可以计算这个高度向后的最大可能值
    public static int run(List<Integer> histogram) {
        int r = 0;
        // 用来记录位置，因为要算长度
        Stack<Integer> s = new Stack<Integer>();
        List<Integer> h = new ArrayList<Integer>(histogram);
        h.add(0);
        for (int i = 0; i < h.size(); ) {
            if (s.empty() || h.get(i) > h.get(s.peek())) {
                s.push(i);
                i++;
            } else {
                int t = s.pop();
                // 拿 2,1,5,6,2,3 举例子
                // 第一个 2，1
                // 如果s空，表明现在弹出来的是从0到i-1，长度为i的区间里面全部都接受的高度
                // 因为只要遇到低的，就会弹出高的，现在后面啥都没有了，就是最小的
                //  5,6,2
                // 如果不是空，peek存的是上一次最高的位置，假设就是在这次pop之前进的
                // = i-2, 那么i-s.peek()-1就是1，就是以这个高度，能达到的retangle长度
                // 因为i不增加，6pop之后，就是pop5，因为 5也小于2，那么能达到的长度就是2
                // 到1，因为 2大于1，2就进去啦，等到最后是0，就会退回到1来计算高度为1的长度
                // 因为 1 是最矮的，就是整个的长度
                r = Math.max(r, h.get(t) * (s.empty()?i:i-s.peek()-1));
            }
        }
        return r;
    }
    @Test
    public void test() {
        List<Integer> h = Arrays.asList(2,1,5,6,2,3);
        List<Integer> h1 = Arrays.asList(2,0,5,6,0,3);
        List<Integer> h2 = Arrays.asList(2,1,5,5,2,3);
        List<Integer> h3 = Arrays.asList(2,1,5,6,5,3);
        List<Integer> h4 = Arrays.asList(2,1,5,6,2,3,4,4,2,1,2,1,2,1,2,1,3,1);
        Assert.assertEquals(10, run(h));
        Assert.assertEquals(10, run(h1));
        Assert.assertEquals(10, run(h2));
        Assert.assertEquals(15, run(h3));
        Assert.assertEquals(18, run(h4));
    }

}
