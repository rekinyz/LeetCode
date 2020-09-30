package snapchat;

import com.leetcode.oj.AddBinaryTest;
/*
 * 题目是要求设计类BigInt表示大整形数，并且有add(BigInt that)可以进行加法。
 * 选择String作为大数的存储，面试官期望听到你问他数的正负，然后告知只要处理正数的加法。
具体算法其实不复杂，类似LeetCode的Add Binary，写完之后要仔细检查，因为一会儿可是要运行的。
自己给出了很多test case，比如1+“”， 999+1， 999+111，invalid character抛出异常情况。在头两次运行时去掉了几个语法错误，
后面就OK了。面试官对很快得到正确结果表示满意，因为时间才过去了一半，开始follow up：

1. 要求修改程序能够处理有leading 0的数，比如0001+009" 
2. 如果你给这段代码做code review，你会提出什么建议。我说了包括给出类和方法的注释，
给变量更有意义的名字。他提示我从效率的角度出发考虑。之前说了是用String作为存储，在做加法时会用到charAt()方法获取当前位的值，
这在Java中这是比较慢的，如果改用char[]存储，直接读取数组元素会比charAt()快很多。
3. 如果这个add方法是作为一个在线API提供给用户的，在实现时需要做哪些优化。因为在线API还有很多用户提出request，
而这些request会有相同的情况，对于一些很长数字的加法可以做一个缓存，下次再有类似请求直接返回结果。进而涉及到缓存优化的问题，
缓存不能无限大，我们应该只保留那些比较hot的request，随着时间的推移把一些不hot的从缓存中删掉，类似于LRU cache的意思。
page 63, 3.4
 */
public class AddBinary extends AddBinaryTest{

    @Override
    protected String addBinary(String a, String b) {
        int max = Math.max(a.length(), b.length());
        int min = Math.min(a.length(), b.length());
        StringBuilder sb = new StringBuilder(max+1);
        a = sb.append(a).reverse().toString();
        sb.setLength(0);
        b = sb.append(b).reverse().toString();
        sb.setLength(0);
        int c = 0;
        for (int i = 0; i<max; ++i) {
            int x = (i<a.length())? a.charAt(i) - '0':0;
            int y = (i<b.length())?b.charAt(i) - '0':0;
            int sum = x + y + c;
            c = sum >> 1;
            char v = (char) (sum % 2 + '0');
            sb.append(v);
        }
        if (c > 0) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }

}
