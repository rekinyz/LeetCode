package uber.design;

import static org.junit.Assert.fail;

import org.junit.Test;
/*
 * 设计一个 Netflix， follow up 很多 比如如何限制同一个用户多处登录不能同时看一个资源，如何实现根据用户的网速调整清晰度，怎么热门推荐
 * 架构上：基本上就是数据层，Service层，前端。因为小编知道Netflix是AWS的忠实用户，
 * 所以基本就以AWS为例：数据存储使用s3，配合Relational db / Non sql database；然后是Service layer，
 * 功能包括：User authentication，session management，data streaming and other business logic；
 * 前台则主要是用户界面。优化包括：如何Cache，如何利用CDN network replicate data close to the users. 
 * 因为Netflix的数据大部分是静态数据，很少更新，电影电视剧的内容完全可以Replicate很多份放到Internet的Edge server上。
 */
public class Netflix {

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
