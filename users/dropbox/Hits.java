package dropbox;

import org.junit.Test;
/* 问有否实时性要求，这个题有两种情况，一种是画status 图，这个没有实时性要求，根据要求的精度，记录成大数组，比如每秒都记录5分钟累计，实时return就OK了
 * 另一种是发现实时的情况突变，比如5分钟发现热点。 这个就需要实时统计，不过 get_hit应该called不多，也需要问优化是 记录更多还是call gethit 更多
 * 如果是每秒一定call gethits, 那么更合适的是保持sum, 因为这样把计算distributed. 如果called不多，还是包括300数组，call的时候求和。
 * 如果是实际系统，如何考虑同步，线程问题？
 * get_hits() 返回 5 分钟内所有hit 次数. 
log_hit() 记录下当期的点击
主要思路就是建一个300大小的 buf,  buf中每一个格对应某一秒钟的所有点击数
get_hits() 时就返回这个数组的sum
可以的优化是 保持一个sum, 每秒update,或func call的时候update, 非常freq的call，可以保持buffer
精度问题：可以增加bucket。 内存 vs 精度 vs 

TODO: 看 http://en.wikipedia.org/wiki/Compare-and-swap lock free and wait free algorithm
 */
public class Hits {
    private final int[] counts;
    private int sum;
    private int lastPos;
    public Hits(int k) {
        counts = new int[k];
    }
    public void log() {
        long time = System.currentTimeMillis();
        int currentPos = (int)((time/1000) % counts.length);
        if (currentPos != lastPos) {
            sum-=counts[lastPos];
            lastPos = currentPos;
        }
        counts[currentPos]++;
        sum++;
    }

    public int getHist() {
        return sum;
    }
// 优化1
    // updateCounter better called asyn with log1, otherwise sum maybe incorrect.
    private static long lastSystemCounter;
    public void updateCounter() {
        int currentPos = (int)((lastSystemCounter) % counts.length);
        if (currentPos != lastPos) {
            sum-=counts[lastPos];
            counts[lastPos] = 0;
            lastPos = currentPos;
        }
    }
    public void log1() {
        counts[lastPos]++;
        sum++;
    }
// how to make updateCounter async? timer不是async, message handler是, message handler保证 处理log1和update不会同时出现
    
    @Test
    public void test() {
    }

}
