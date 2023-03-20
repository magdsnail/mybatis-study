import com.kuang.dao.BlogMapper;
import com.kuang.pojo.Blog;
import com.kuang.utils.IDUtils;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * ClassName: MyTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Date: 2023-03-20 020 15:44
 * @Author: wangkejing
 */
public class MyTest {

    @Test
    public void addBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();

        blog.setId(IDUtils.getId());
        blog.setTitle("mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("java如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("spring如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);

        sqlSession.close();
    }


    @Test
    public void queryBlogIF() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
//        map.put("title", "java如此简单");
//        map.put("author", "狂神说");


//        map.put("title", "java如此简单");
//        map.put("views", 9999);


        map.put("title", "java如此简单2");
        map.put("author", "狂神说2");
        map.put("id", "25366a91801545e6a37a096ec72f3a3e");
        mapper.updateBlogSet(map);

//        List<Blog> blogs = mapper.queryBlogChoose(map);

//        for (Blog blog : blogs) {
//            System.out.println(blog);
//        }

        sqlSession.close();
    }
}
