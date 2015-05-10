package snapchat;

import static org.junit.Assert.fail;

import org.junit.Test;
/*
 * Amicable pair
 * http://mathworld.wolfram.com/AmicablePair.html
 * 如果两个数的公约数（不含自身）的和相同，那么是 Amicable pair
 * 如果是给两个数，就是求公约数，比较和。这里的问题估计需要去掉素数，因为公约数就是1，都一样
 * 求公约数的过程和判断素数有点像
 * 两个都是素数和 一个素数，一个 1，应该 true
 * 一个是另一个倍数，小的不是1，应该false
 * 2, 1  == true?
 * 3, 1 == true?
 *  only try number between 2~sqrt(x)
 * uber.PrimeNumber
 */
public class AmicablePair {
    public static boolean run(int a, int b) {
        if (a == b) return true;
        if (a < b) return run(b, a);
        if ((a % b) == 0) return false;
        
        
    }
    
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
