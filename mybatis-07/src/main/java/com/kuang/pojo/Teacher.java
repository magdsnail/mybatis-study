package com.kuang.pojo;

import lombok.Data;

import java.util.List;

/**
 * ClassName: Teacher
 * Package: com.kuang.pojo
 * Description:
 *
 * @Date: 2023-03-18 018 13:56
 * @Author: wangkejing
 */

@Data
public class Teacher {
    private int id;
    private String name;

    private List<Student> students;
}
