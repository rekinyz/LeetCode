package uber;

import static org.junit.Assert.fail;

import org.junit.Test;
/*
 * this is machine learning code
 * 也在这里放  给定一组点，求离原点最近的k个点，因为uber会用到
 * http://xinpeng.me/?p=607
 * 应该是topk + 如何最小限制入选topK可选对象的数，比如用x,y分别 index.
 * 做法应该是根据地图的zoom level 分块，最多用4块
 * topK 使用快速排序的思想
 * N个数存储在数组S中，再从数组中随机选取一个数X（随机选取枢纽元，可做到线性期望时间O（N）的复杂度，
 * 在第二节论述），把数组划分为Sa和Sb俩部分，Sa<=X<=Sb，如果要查找的k个元素小于Sa的元素个数，
 * 则返回Sa中较小的k个元素，否则返回Sa中所有元素+Sb中小的k-|Sa|个元素。像上述过程一样，
 * 这个运用类似快速排序的partition的快速选择SELECT算法寻找最小的k个元素，在最坏情况下亦能做到O（N）的复杂度。
 * 
 * 有一个类似的：
 * 任给一个手机的位置信号(经纬度)，需要返回附近5mile 的POI
   但是不一样
 */
public class KNearestNeighbor {

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
