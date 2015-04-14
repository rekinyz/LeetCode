package dfs;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
/*
 * 原题感觉是只要是string的一个部分是valid ip,就ok
 */
public class RestoreIPAddress {
    public static List<String> run(String s) {
        List<String> r = new ArrayList<String>();
        StringBuilder ip = new StringBuilder();
        dfs(s, 0, 0, ip, r);
        return r;
    }
    /*
     * @param[in] step 当前步骤编号，从0 开始编号，取值为0,1,2,3,4 表示结束了
     */
    public static void dfs(String s, int start, int step, StringBuilder ip, 
            List<String> r) {
        if (start == s.length() && step == 4) {
            ip.deleteCharAt(ip.length()-1);// remove .
            r.add(ip.toString());
            return;
        }
        if (s.length() - start > (4-step)*3) return;
        if (s.length() - start < (4-step)) return;
        int num = 0;
        for (int i = start; i < start+3; i++) {
            num = num*10 + s.charAt(i) -'0';
            if (num <= 255) {
                ip.append(s.charAt(i));
                dfs(s, i+1, step+1, ip.append('.'), r);
            }
            if (num==0) break;// 不允许前缀0，但允许单个0
        }
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
