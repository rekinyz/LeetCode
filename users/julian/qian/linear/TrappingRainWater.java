package julian.qian.linear;

import junit.framework.Assert;

import org.junit.Test;

public class TrappingRainWater {
    public int run(int[] w) {
        int[] leftMax = new int[w.length];
        int[] rightMax = new int[w.length];
        int max = 0;
        for (int i = 0; i < w.length; ++i){
            leftMax[i] = max;
            max = Math.max(max, w[i]);
        }
        max = 0;
        for (int i = w.length-1; i >= 0; --i){
            rightMax[i] = max;
            max = Math.max(max, w[i]);
        }
        int sum = 0;
        for (int i = 0; i < w.length; ++i){
            int value = Math.min(leftMax[i], rightMax[i]) - w[i];
            if (value > 0) {
                sum+=value;
            }
        }
        return sum;
    }
    @Test
    public void test() {
        int[] w = {0,1,0,2,1,0,1,3,2,1,2,1};
        Assert.assertEquals(6, run(w));
    }

}
