package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.*;

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


    //多个参数必须加上@param注解
    @Select("select * from user where id = #{id}")
    User getUserByID(@Param("id") int id);

    @Insert("insert into user(id, name, pwd) values (#{id},#{name},#{password})")
    int insterUser(User user);

    @Update("update user set name=#{name}, pwd=#{password} where id = #{id}")
    int updateUser(User user);

    @Delete("delete from user where id = #{uid}")
    int deleteUser(@Param("uid") int id);

}
