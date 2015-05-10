package snapchat;

import static org.junit.Assert.fail;

import org.junit.Test;
/*
 * 给手机的画图app写个屏幕旋转的method。同样问了许多design问题。
 * 旋转屏幕那题就是看你把用户画的那些像素存在什么data structure里。存一个list就可以了，assumption是用户画的点一般比较sparse，不用存整个矩阵。
 * design问题就是问问为什么选这个data structure之类的，还有就是想想如果device旋屏时候计算速度太慢会发生什么之类的。
 * 旋转是围绕一个点，先计算现在的角度，新的Y = sin(d) * length  X = cos(d) * length
 */
public class RotateScreen {

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
