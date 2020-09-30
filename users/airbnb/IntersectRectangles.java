package airbnb;

import static org.junit.Assert.fail;

import org.junit.Test;
/*
 * You have a plain with lots of rectangles on it, find out how many of them intersect  
 * rectangle是否有斜的？
 * 假设没有斜的，rectangles可以用左上角的一个点+长和宽表示
 * 看 introduction to algorithms的14.3章
 * 算法：
 * 将x1,x2合并 sort，x1是小x x2
 * scan x list，如果是x1， 将Y插入 树，如果是x2，退出树，进入树的时候检查是否有重叠
 */
public class IntersectRectangles {
    // x1,y1 top,left,  x2y2 bottom right, 更合适的是左下和右上，这样x和y的最小和最大在一起
    public static class Rectangle {
        float x1, y1, x2,y2;
        public boolean intersec(Rectangle r) {
            return !(x1 > r.x2 || x2 < r.x1 || y1 < r.y2 || y2 >r.y1);
        }
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
