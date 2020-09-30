package QueueStack;

import java.util.List;
import java.util.Stack;

import junit.framework.Assert;

import org.junit.Test;

import com.leetcode.oj.util.CollectionGen;

public class LargestRectangleInHistogram {
/* 因为要计算面积，高在list里面，宽度需要保存，stack用来存index，可以计算宽度, 用stack保存这个高度的上次的位置，其实是高度上次的位置-1
 * 不必计算一个立柱两边扩展的宽度，只需要计算到左边最低的宽度，
 * 以维护一个递增的栈，每次比较栈顶与当前元素。如果当前元素大于栈顶元素，说明还有机会更高
则入栈，否则，如果等于，还有机会更高，应该不进stack,也不用计算，下次遇到低的元素就会计算
如果小 已经没有机会更高了，最高前一个元素的高度，* 栈顶元素index和pop 出去最高元素后的index的差。
这道题的核心是保存某个高度的从右往左看，第一次到达这高度的前一个index, 用stack的原因是定位前一个高度，通过 stack，只要是低于这个高度，就清算，
保证一定是达到这个高度。
如果不用stack, 需要用数组保存，并在低于高度的时候update数组，不如用stack,
stack合适，是因为只计算部分的内容。
 */
    public static int run(List<Integer> h) {
        Stack<Integer> s = new Stack<Integer>();
        h.add(0);
        int result=0;
        for (int i = 0; i < h.size(); ) {
            if (s.isEmpty() || h.get(i) > h.get(s.peek())) {
                s.push(i);
                i++;
            } else if (h.get(i) < h.get(s.peek())){
                // 这里不加index,因为如果比stack里的还低，需要计算，如果高，需要加入
                int lastH = s.pop();
                System.out.format("l %d h %d s %d\r\n", lastH, h.get(lastH), s.size());
                result = Math.max(result, 
                        h.get(lastH) * (s.isEmpty()?i:i-s.peek()-1));
            } else {
                i++;
            }
        }
        return result;
    }
    @Test
    public void test() {
        int[] r = {2,1,5,6,2,3};
        
        List<Integer> l = CollectionGen.toList(CollectionGen.intToInteger(r));
        
        Assert.assertEquals(10, run(l));
        int[] r1 = {2,1,5,5,6,2,3};
        
        List<Integer> l1 = CollectionGen.toList(CollectionGen.intToInteger(r1));
        
        Assert.assertEquals(15, run(l1));
    }

}
