package snapchat;

import junit.framework.Assert;

import org.junit.Test;

import New.ExcelSheetColumnNumber;
/*
 * http://itjob.io/post/249
 * Microsoft Excel的列名具有这样的模式 A,B,C,...,Z,AA,AB,AC,...,AZ,BA,BB,...ZZ,AAA,AAB,...,等等，
 * 换句话说第一列是A，第二列是B，第27列是AA
给定一个列编号，求对应的列名，比如
输入          输出
 1              A
 26             Z
 27             AA
 51             AY
 52             AZ(1* 26 + 26)
 80             CB
 676            YZ (26*26)
 702            ZZ
 705            AAC
 
 可以相互转换
 看起来像27进制和10进制转换，但是有不同，关键是A不能类比0，也不能类比1 因为 AA 和 A都存在
 如果拿26进制，问题是 26 % 26 = 0， 这个0不能算 在1, 26, 52等特殊情况进行考虑
 */
public class ExcellColName extends ExcelSheetColumnNumber{
    private static final int BASE = 26;
    public static String to26(int i) {
        StringBuilder sb = new StringBuilder();
        while( i > 0) {
            int x = i % BASE;
            if (x > 0) {
                sb.append((char)(x + 'A' - 1));
            } else {
                // 正好26会产生一个Z，因为真26进制是0到25，这个是1到26，产生一个Z就意味着下一个字母要移动一位，
                // 因为用整除，所以--就OK了
                sb.append('Z');
                i--;
            }
            i = i / BASE;
        }
        return sb.reverse().toString();
    }
    public static int to10(String a) {
        int v = 0;
        for (int i = 0; i <a.length(); i++) {
            int j = a.charAt(i)-'A'+1;
            v = v*26 + j;
            
        }
        return v;
    }
    @Override
    @Test
    public void test() {
        Assert.assertEquals(to10("A"), 1);
        Assert.assertEquals(to10("Z"), 26);
        Assert.assertEquals(to10("AA"), 27);
        Assert.assertEquals(to10("AY"), 51);
        Assert.assertEquals(to10("AZ"), 52);
        Assert.assertEquals(to10("CB"), 80);
        Assert.assertEquals(to10("YZ"), 676);
        Assert.assertEquals(to10("ZZ"), 702);
        Assert.assertEquals(to10("AAC"), 705);
        
        Assert.assertEquals("A", to26(1));
        Assert.assertEquals("Z", to26(26));
        Assert.assertEquals("AA", to26(27));
        Assert.assertEquals("AY", to26(51));
        Assert.assertEquals("AZ", to26(52));
        Assert.assertEquals("CB", to26(80));
        Assert.assertEquals("YZ", to26(676));
        Assert.assertEquals("ZZ", to26(702));
        Assert.assertEquals("AAC", to26(705));
    }
}
