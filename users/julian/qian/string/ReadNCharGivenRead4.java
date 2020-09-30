package julian.qian.string;

import static org.junit.Assert.fail;

import org.junit.Test;
/********************************************************************************** 
 * 
 * The API: int read4(char *buf) reads 4 characters at a time from a file.
 * 
 * The return value is the actual number of characters read. 
 * For example, it returns 3 if there is only 3 characters left in the file.
 * 
 * By using the read4 API, implement the function int read(char *buf, int n) 
 * that reads n characters from the file.
 * 
 * Note:
 *   The read function will only be called once for each test case.
 * read4没有给读得数量，如果多读了如何处理？可以考虑用静态buffer,保存上次多读的
 **********************************************************************************/

public class ReadNCharGivenRead4 {
    public static int read4(char[] buf, int pos) {
        return 0;
    }
    // 可以考虑 buf size 是 4的倍数就直接读，不是就用中间buffer
    public static int read1(char[] buf) {
        int len = 0;
        int size = 0;
        
        while(len <=buf.length && ((size = read4(buf, len))>0)) {
            size = len + size > buf.length ? buf.length - len:size; // overlow if first
            len += size;           
        }
        return len;
    }
    public static int read2(char[] buf) {
        char[] _buf = new char[4];
        int _n = 0;
        int len=0, size;
        while ((_n = read4(_buf, 0))>0) {
            size = len + _n > buf.length ? buf.length - len : _n;
            System.arraycopy(_buf, 0, buf, len, size);
            len += size;
            if (len >= buf.length) break;
        }
        return len;
    }
    // You have to buffer the extra data return from `read4()` API, which is for next call for `read()` .
    static char[] _buf = new char[4];
    static int _n = 0;
    public static int read3(char[] buf) {
        
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
