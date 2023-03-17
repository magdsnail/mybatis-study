package com.kuang.dao;

import com.kuang.pojo.User;

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
    List<User> getUserList();//查询全部用户

    //根据id查询用户
    User getUserById(int id);

//    inster 一个用户
    int addUser(User user);

    int addUser2(Map<String, Object> map);

    int updateUser(User user);

    int deleteUser(int id);
}
