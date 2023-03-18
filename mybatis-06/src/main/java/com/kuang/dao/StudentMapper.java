package com.kuang.dao;

import com.kuang.pojo.Student;

import java.util.List;

/**
 * ClassName: StudentMapper
 * Package: com.kuang.dao
 * Description:
 *
 * @Date: 2023-03-18 018 13:57
 * @Author: wangkejing
 */
public interface StudentMapper {
    //查询所有的学生信息 老师信息
    List<Student> getStudent();
    List<Student> getStudent2();

}
