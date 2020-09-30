package airbnb.design;

import static org.junit.Assert.fail;

import org.junit.Test;
/*
 * 设计一个distributed cache. 回答这类题目需要对分布式系统有一定了解，小编觉得以下几点是需要讲清楚的：

Distribute策略：当Cache数据量巨大的时候，需要用多个Node来存储Cache。由于Cache本质上是Key-value-pair，
那么可以通过对Key进行类似Hash的Sharding可以决定Value需要存储/读取的Node.
Cache策略：基本上就是Pull (on-demand)/Push(regular update)的区别。具体情况要考虑需求的具体情况，
比如对与Cache数据实时性的要求，对于Performance要求等，一定程度上也考察面试者的沟通能力。
Failure case以及Scalability的讨论，
implement memcache
http://www.adayinthelifeof.nl/2011/02/06/memcache-internals/

memcache用自己的内存分配，以避免碎片问题，一个page是1MB，page存放相同大小的chunk, chunk从80开始分配。每个大小有自己的LRU
直接用mod分配server会有一个问题，如果加减server的时候，所有cache都invalid, 可以的做法是用一个 array，
mod到这个array, 由这个array来决定是哪个server,这个array可以修改。

 */
public class DistributeCache {

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
