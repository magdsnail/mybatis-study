package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: UserMapper
 * Package: com.kuang.dao
 * Description:
 *
 * @Date: 2023-03-21 021 10:20
 * @Author: wangkejing
 */
public interface UserMapper {

    //根据id查询用户
    User queryUserById(@Param("id") int id);


    int updateUser(User user);
}
