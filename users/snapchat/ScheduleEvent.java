package snapchat;

import static org.junit.Assert.fail;

import org.junit.Test;

import airbnb.MaxRental;
/* 可以参考 MaxRental
 *  先是建一个event, 里面有start time和end time, 然后check这两个event有没有conflict,
 *   各种if else, 然后升级, 给一个list of events, 直接sort他们。
 *   这个可以看成就是一个office的情况，按start time 排序，之后就可以判断，因为只要发现一个conflict
 *   这样只用比较 i 和 i+1
 *   再升级, 建一个schedule,
 *    给几个office, 问怎么样的solution才是optimal的。这个其实是 1个office的问题的简单重复，
 *    这个的问题是需要给出可行安排或说不可行吗？还是最少用几个room?
 *    
 *  是用红黑树比较好参考Uber有一个2维的题，比这个难
 */
public class ScheduleEvent extends MaxRental{

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
