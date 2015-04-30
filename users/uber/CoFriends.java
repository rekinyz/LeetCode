package uber;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;
// compute co friends of two people in sns
// 题目不明确，如果是纯co-friend,就是比较两个List的共同部分，o(n)hashmap

public class CoFriends {
    public static List<String> intersection(String[] a, String[] b) {
        List<String> r = new ArrayList<String>();
        HashSet<String> m = new HashSet<String>();
        for (String x : a) {
            m.add(x);
        }
        for (String k: b) {
            if (m.contains(k)) {
                r.add(k);
            }
        }
        return r;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
