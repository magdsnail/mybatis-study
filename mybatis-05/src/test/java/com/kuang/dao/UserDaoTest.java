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

    @Test
    public void getUsers() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        for (User user : mapper.getUsers()) {
            System.out.println(user);
        }

        sqlSession.close();

    }





}
