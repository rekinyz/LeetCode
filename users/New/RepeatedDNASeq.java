package New;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
/*
 * All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, 
 * for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify 
 * repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur 
more than once in a DNA molecule.

For example,

Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",

Return:
["AAAAACCCCC", "CCCCCAAAAA"].
ACGT 用 2位编码，用20位可以方便计算，c比较好用，java不能设置20bit数据类型，比较不好用。
不过可以用 -老的 * 2^18 左移位 2 +新的，来取到新的值

犯过的错：decode, 没有每次减小原来的数；
 */
public class RepeatedDNASeq {
    public static int encode(char c) {
        if (c == 'A') return 0;
        if (c == 'C') return 1;
        if (c == 'G') return 2;
        if (c == 'T') return 3;
        throw new RuntimeException("unknown");
    }
    public static final int SEQ_SIZE = 10;
    public static List<String> run(String a) {
        List<String> r = new ArrayList<String>();
        if (a.length() < SEQ_SIZE) return r;
        HashSet<Integer> s = new HashSet<Integer>();
        // compute first one
        int hash = 0;
        for (int i = 0; i < SEQ_SIZE; i++) {
            hash = hash << 2;
            hash += encode(a.charAt(i));
        }
        s.add(hash);
        for (int i = 1; i < a.length() - SEQ_SIZE + 1; ++i) {
            int top = encode(a.charAt(i-1));
            top <<= 18;
            hash -= top;
            hash <<= 2;
            hash += encode(a.charAt(i + SEQ_SIZE - 1));
            if (s.contains(hash)) {
                r.add(decode(hash, SEQ_SIZE));
            } else {
                s.add(hash);
            }
        }
        return r;
    }
    public static String decode(int r, int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; ++i) {
            int v = r; // BUG: should keep input here, to remove last 2 bit needs more computation
            r >>= 2;
            r <<= 2;
            int right = v - r;
            r >>= 2;
            char c;
            if (right == 0) {
                c = 'A';
            } else if (right == 1) {
                c = 'C';
            } else if (right == 2) {
                c = 'G';
            } else {
                c = 'T';
            }
            System.out.format("r %d c %d\r\n", r, right);
            sb.append(c);
        }
        return sb.reverse().toString();
    }
    @Test
    public void test() {
        Assert.assertEquals("AC",decode(1,2));
        Assert.assertEquals("CA",decode(4,2));
        Assert.assertEquals("ACC",decode(5,3));
        List<String> r = Arrays.asList("AAAAACCCCC","CCCCCAAAAA");
        //Assert.assertEquals(r, run("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }

}
