package airbnb;

import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import org.junit.Test;

public class ParseCSV {
/*
 * 给定一个CSV文件，格式是 “some_name|some_address|some_phone|some_job”，
 * 要求输出Json format “{name:some_name, address:some_addres,phone:some_phone, job:some_job}”
 * 错误输入（多于4个模块，没有\r\n（line break是啥？），名字里面有 |， 
 * 考虑做成library
 * 要处理好转义字符，比如\r\n 
 */
    private final String[] fields;
    private final String dilimit;
    // just a place holder, in case children class may need to handle error differently
    public void error(String line) {
        
    }
    public ParseCSV(String[] fields, String dilimit) {
        this.fields = fields;
        this.dilimit = dilimit;
    }
    public void append(StringBuilder sb, String line) {
        String[] t = line.split(dilimit);
        if (t != null && t.length == fields.length) {
            for (int i = 0; i < t.length; ++i) {
                sb.append(fields[i]).append(t[i]);
            }
            // sb remove \r\n if it has, line break() as para
        } else {
            error(line);
        }
    }
    public void process(String csvFile) {
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
     
        try {
     
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
     
                    // use comma as separator
                String[] country = line.split(cvsSplitBy);
     
                System.out.println("Country [code= " + country[4] 
                                     + " , name=" + country[5] + "]");
     
            }
     
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    @Test
    public void test() {
        ParseCSV p = new ParseCSV(new String[]{"name:",", address:",", phone:",", job:"}, "|");
        StringBuilder sb = new StringBuilder();
        String[] t = "some_name|some_address|some_phone|some_job".split("|");
        
        StringTokenizer sk = new StringTokenizer("some_name|some_address|some_phone|some_job","|");
        fail("Not yet implemented");
    }

}
