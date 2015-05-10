package snapchat;

import static org.junit.Assert.fail;

import org.junit.Test;
/*
 * 一个array的range是1到N，这个array里有1+N个数, 找出这个array里的duplicate。(ex. [1, 1, 3, 2]) 
 * 求和，可以直接算出来，如果连和这个空间也不让用，可以用XOR+桶排序
给一个数组，判断里面是否有duplicate。可以用hash
扩展1，判断是否有相隔较近的duplicate。[1, 1, 2, 2] 对dup的数排序，或按照相隔较近多做几次hash
扩展2，判断是否有相隔较近的，作差不超过某个上限的数对。比如差为1 [1, 2, 13, 12],排序或做定义的差的hash查询
http://www.1point3acres.com/bbs/thread-107980-1-1.html
 */
public class ArrayDup {

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
