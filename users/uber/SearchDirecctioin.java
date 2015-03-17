package uber;
/*
 * 给一串direction, 比如A N C 意味着A在C的北边。写一个function验证这些direction
是否valid

Note：A N C, A NE C同时出现是合法的

例子：下面这个不合法，因为A N C, C NE D所以不可能A S D
A N C
B NE C
C NE D
A S D
B W A
--
find a path between A and D, if there is one, and compare this path with new input.

 */
import static org.junit.Assert.fail;

import org.junit.Test;

public class SearchDirecctioin {

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
