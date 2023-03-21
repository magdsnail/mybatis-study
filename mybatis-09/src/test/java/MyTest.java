import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * ClassName: MyTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Date: 2023-03-21 021 10:57
 * @Author: wangkejing
 */
public class MyTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);

        //会刷新缓存 增删改可能改变原来数据 所以必定会刷新缓存
//        mapper.updateUser(new User(2, "aaaa", "bbb"));

//        sqlSession.clearCache();

        User user1 = mapper.queryUserById(1);
        System.out.println(user1);

        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);


        User user = mapper.queryUserById(1);
        System.out.println(user);
        sqlSession.close();

        User user1 = mapper2.queryUserById(1);
        System.out.println(user1);
        sqlSession2.close();
    }
}
