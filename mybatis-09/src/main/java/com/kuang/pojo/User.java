package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: User
 * Package: com.kuang.pojo
 * Description:
 *
 * @Date: 2023-03-21 021 10:21
 * @Author: wangkejing
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private int id;
    private String name;
    private String pwd;
}
