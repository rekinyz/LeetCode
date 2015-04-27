package julian.qian.linear;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;
/*
 * Given a number represented as an array of digits, plus one to the number
 */
public class PlusOne {
    public static ArrayList<Integer> run(ArrayList<Integer> d, int c) {
        for(int i = d.size() - 1; i >=0; ++i) {
            int digit = d.get(i);
            digit += c;
            c = digit/10;
            digit %= 10;
            d.set(i, digit);
        }
        if (c>0) d.add(0, 1);
        return d;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
