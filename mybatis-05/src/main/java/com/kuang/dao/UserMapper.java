package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * ClassName: UserDao
 * Package: com.kuang.dao
 * Description:
 *
 * @Date: 2023-03-16 016 14:05
 * @Author: wangkejing
 */
public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();
}
