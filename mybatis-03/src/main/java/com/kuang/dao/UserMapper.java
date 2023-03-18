package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

/**
 * ClassName: UserDao
 * Package: com.kuang.dao
 * Description:
 *
 * @Date: 2023-03-16 016 14:05
 * @Author: wangkejing
 */
public interface UserMapper {
    User getUserById(int id);
}
