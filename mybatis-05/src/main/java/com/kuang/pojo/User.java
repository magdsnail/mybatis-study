package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

/**
 * ClassName: User
 * Package: com.kuang.pojo
 * Description:
 *
 * @Date: 2023-03-16 016 13:58
 * @Author: wangkejing
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String password;
}
