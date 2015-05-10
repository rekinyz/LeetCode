package snapchat;

import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
/*
 * Write a diff program comparing two files, that gives a unix like output
 * binary or text?
 * http://c2.com/cgi/wiki?DiffAlgorithm
 * The basic idea is to find min 'modification script' that will turn Text A into Text B，所以是DP
 * 因为edit distance找到的就是diff
 * 问是否是TEXT，因为TEXT有天然分隔的分行，可以hash,快速找到相同的行，binary不行，一个开始的移位，就全错了
 * 简版：
 * http://introcs.cs.princeton.edu/java/96optimization/Diff.java.html
 * unix diff是源代码diff,所以是line by line diff
 * 只要找到相同的行就可以
 */
public class diff {
    public static List<String> readFile(String n) {
        List<String> r = new ArrayList<String>();
        BufferedReader br=null;
        try {
            br = new BufferedReader(new FileReader(n));
            String line = br.readLine();

            while (line != null) {
                r.add(line);
                line = br.readLine();
            }
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return r;
    }
    public static List<String> readAllLines(String n) {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(n), Charset.defaultCharset());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }
    public static long[] hash(List<String> s) {
        long[] x = new long[s.size()];
        for (int i = 0; i < s.size(); ++i) {
            x[i] = s.get(i).hashCode();
        }
        return x;
    }
    public static void main(String[] args) {
        List<String> s1 = readAllLines(args[0]);
        List<String> s2 = readAllLines(args[1]);
        
        long[] x = hash(s1);
        long[] y = hash(s2);
        
        // number of lines of each file
        int M = x.length;
        int N = y.length;

        // opt[i][j] = length of LCS of x[i..M] and y[j..N]
        int[][] opt = new int[M+1][N+1];

        // compute length of LCS and all subproblems via dynamic programming
        for (int i = M-1; i >= 0; i--) {
            for (int j = N-1; j >= 0; j--) {
                if (x[i] == y[j])
                    opt[i][j] = opt[i+1][j+1] + 1;
                else 
                    opt[i][j] = Math.max(opt[i+1][j], opt[i][j+1]);
            }
        }

        // recover LCS itself and print out non-matching lines to standard output
        int i = 0, j = 0;
        while(i < M && j < N) {
            if (x[i]==y[j]) {
                //相同不打印
                i++;
                j++;
                // x退一行，共同的行多
            } else if (opt[i+1][j] >= opt[i][j+1]) {
                System.out.println("< " + x[i]);
                i++;//
            } else {
                System.out.println("> " + y[j++]);
            }
        }

        // dump out one remainder of one string if the other is exhausted
        while(i < M || j < N) {
            if      (i == M) System.out.println("> " + y[j++]);
            else if (j == N) System.out.println("< " + x[i++]);
        }
    }

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
