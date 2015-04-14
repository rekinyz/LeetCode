package Pinter;

import static org.junit.Assert.fail;

import org.junit.Test;
/*
 * 有一个文件，每一行是一句话。 现在一个函数get8K的函数可以调用该函数返回8KB的数据，没调用一次返回8K的文件。
 * 现在要求写一个wrapper实现nextline函数。nextline函数可以调用已有的get8K，但是每次调用需要返回下一行的数据。
 * question: 1) what's size of a line, how many k could it be. assume within 8k. 需要
 * 一个 8k output buffer, 和一个8k input buffer
 * 2) new line '\r'
 * 心得：这种细节题，需要重复判断的，考虑用递归，每次解决一个循环判断，比写loop简单还高大上
 * 应该用最简单不容易出错的写成unittest,再考虑复杂的算法
 */
public class NextLine {
    public void read() {
        
    }
    private final StringBuilder input = new StringBuilder();
    private final StringBuilder output = new StringBuilder();
    private int input_index;
    public String next() {
        run();
        return output.toString();
    }
    public void run() {
        int len = input_index;
        if (input.length() == 0) read();
        while(len < input.length()) {
            if (input.charAt(len) == '\r') {
                break;
            }
            len++;
        }
        output.append(input.subSequence(input_index, len));
        if (len == input.length()) {
            input_index = 0;
            read();
            run();
        } else {
            input_index = len;
        }
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
