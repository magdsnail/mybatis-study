package com.kuang.dao;

import com.kuang.pojo.Information;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: InformationMapper
 * Package: com.kuang.dao
 * Description:
 *
 * @Date: 2023-03-30 030 20:10
 * @Author: wangkejing
 */
public interface InformationMapper {
    List<Information> list();
    int autoIncrement(@Param("field") String field, @Param("type") String type, @Param("num") int num);
}
