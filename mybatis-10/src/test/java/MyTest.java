import com.kuang.dao.InformationMapper;
import com.kuang.pojo.Information;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * ClassName: MyTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Date: 2023-03-30 030 20:25
 * @Author: wangkejing
 */
public class MyTest {
    @Test
    public void list() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        InformationMapper mapper = sqlSession.getMapper(InformationMapper.class);
        List<Information> list = mapper.list();
        for (Information information : list) {
            System.out.println(information);
        }
    }


    @Test
    public void autoIncrement() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        InformationMapper mapper = sqlSession.getMapper(InformationMapper.class);
        mapper.autoIncrement("support_num", "add", 1);
        System.out.println("success");

    }
}
