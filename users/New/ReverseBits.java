package New;

import static org.junit.Assert.fail;

import org.junit.Test;
/*
 * Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).

Follow up:
If this function is called many times, how would you optimize it?
这个题合适c做，java不合适
c用 union 和 ：8
定义一个union, 是 32int 和 4个byte 一起, 一个byte的反转可以用hashtable
每个byte反转，之后  1,4  2,3互换，就OK了
 */
public class ReverseBits {

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
