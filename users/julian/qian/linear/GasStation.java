package julian.qian.linear;

import junit.framework.Assert;

import org.junit.Test;
/*
 * page 35
 */
public class GasStation {
    public static int run(int[] cost, int[] gas) {
        int total = 0, fromLastStartSum = 0;
        int start = -1;
        for (int i = 0; i < cost.length; ++ i) {
            int value = gas[i] - cost[i];
            fromLastStartSum += value;
            total += value;
            if (fromLastStartSum < 0) {
                start = i;
                fromLastStartSum = 0;
            }
        }
        return total>0 ? start+1:-1;
    }
    @Test
    public void test() {
        int[] gas1 = {5,1,2,3,2};
        int[] cost1 = {6,1,1,4,2};
        Assert.assertEquals(-1, run(cost1, gas1));
        int[] gas2 = {5,1,2,2,5};
        int[] cost2 = {6,1,1,4,3};
        Assert.assertEquals(-1, run(cost1, gas1));
    }

}
