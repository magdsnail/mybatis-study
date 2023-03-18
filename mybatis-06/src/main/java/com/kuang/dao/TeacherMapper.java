package com.kuang.dao;

import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * ClassName: Teacher
 * Package: com.kuang.dao
 * Description:
 *
 * @Date: 2023-03-18 018 13:57
 * @Author: wangkejing
 */
public interface TeacherMapper {

    @Select("select * from teacher where id = #{tid}")
    Teacher getInstance(@Param("tid") int id);

}
