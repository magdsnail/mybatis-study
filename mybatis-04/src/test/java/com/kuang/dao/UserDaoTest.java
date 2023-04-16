package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


/**
 * ClassName: UserDaoTest
 * Package: com.kuang.dao
 * Description:
 *
 * @Date: 2023-03-16 016 14:43
 * @Author: wangkejing
 */
public class UserDaoTest {

    static Logger logger = Logger.getLogger(UserDaoTest.class);
    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        logger.info(user);

        sqlSession.close();
    }
    @Test
    public void getUserByLimit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", 1);
        map.put("pageSize", 3);

        List<User> userlist = mapper.getUserByLimit(map);

        for (User user : userlist) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserByRounds() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        RowBounds rowBounds = new RowBounds(1, 2);

        List<User> userList = sqlSession.selectList("com.kuang.dao.UserMapper.getUserByRounds", null, rowBounds);

        for (User user : userList) {
            logger.info(user);
        }

        sqlSession.close();
    }

    @Test
    public void testLog4j(){
        logger.debug("hahahahhha");
    }







}
