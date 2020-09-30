package greedy;

import static org.junit.Assert.fail;

import org.junit.Test;
/*
 * 局部最优也是全局最优，保持变量记录局部最优就ok
 */
public class JumpGame {
    public static boolean run(int[] a) {
        int reach = 1;
        int n = a.length;
        // 核心在i < reach，如果某处过不去，就会 i >= reach, 跳出循环就false
        // i == reach,是不够的， reach 1base，i 0base
        for (int i = 0; i < reach && reach < n; ++i) {
            reach = Math.max(reach, i+1+a[i]);
        }
        return reach >=n;
    }
    /*
     * A = [2,3,1,1,4]
     * [3,2,1,0,4]
     * 这个算法需要保证能jump，如果不能jump到最后，return value是错的
     * 需要参考 i < reach && reach < n的做法。
     */
    public static int runStep(int[] a) {
        int step = 0;
        int n = a.length;
        int last_jump=0, cur_max_jump=0;
        for (int i = 0; i < n; ++i) {
            if (i > last_jump) {
                last_jump = cur_max_jump;
                ++step;
            }
            cur_max_jump = Math.max(cur_max_jump, i + a[i]);
        }
        return step;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
