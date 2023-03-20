package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * ClassName: Blog
 * Package: com.kuang.pojo
 * Description:
 *
 * @Date: 2023-03-20 020 15:04
 * @Author: wangkejing
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    private String id;
    private String title;
    private String author;
    private int views;
    private Date createTime;//属性名和字段名不一致
}
