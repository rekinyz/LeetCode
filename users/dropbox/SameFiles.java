package dropbox;

import static org.junit.Assert.fail;

import org.junit.Test;
/*
# Find files that have the exact same contents in a given directory. 
Write a function that takes a path and returns a list of lists or sets.
 Each set should contain files that have the same content.
# An example output is for the input "/foo/" is: 
#    ["/foo/bar.png", "/foo/images/foo.png"]
#    ["/foo/file.tmp", "/foo/other.temp", "/foo/temp/baz/that.foo"].
我答的是用HashMap<String, List<String>>, key里存的是MD5, 
List<String>里面存的是files that have same contents. 面试官要求优化，认为算MD5太消耗资源。
最后讨论的结果是key是文件长度。最后再判断List<String>里面存的文件是否是一样的文件,
对于list只有2个文件，可以考虑 直接比较，对于大于 2， 可以考虑 tiger hash
 */
public class SameFiles {

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
