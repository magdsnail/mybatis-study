package com.kuang.dao;

import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName: Teacher
 * Package: com.kuang.dao
 * Description:
 *
 * @Date: 2023-03-18 018 13:57
 * @Author: wangkejing
 */
public interface TeacherMapper {

    //获取老师
//    List<Teacher> getTeacher();

    //获取指定老师下的所有学生及老师的信息
    Teacher getTeacher(@Param("tid") int id);
    Teacher getTeacher2(@Param("tid") int id);


}
