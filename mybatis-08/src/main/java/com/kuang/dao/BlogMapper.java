package com.kuang.dao;

import com.kuang.pojo.Blog;
import org.apache.ibatis.annotations.Insert;

import java.util.List;
import java.util.Map;

/**
 * ClassName: BlogMapper
 * Package: com.kuang.dao
 * Description:
 *
 * @Date: 2023-03-20 020 15:08
 * @Author: wangkejing
 */
public interface BlogMapper {
    //插入数据
    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map map);


    //查询
    List<Blog> queryBlogChoose(Map map);


    //更新博客
    int updateBlogSet(Map map);

    //查询第1 2 3的博客
    List<Blog> queryBlogForeach(Map map);
}
