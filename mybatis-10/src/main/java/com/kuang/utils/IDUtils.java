package com.kuang.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * ClassName: IDUtils
 * Package: com.kuang.utils
 * Description:
 *
 * @Date: 2023-03-20 020 15:14
 * @Author: wangkejing
 */

@SuppressWarnings("all")//抑制警告
public class IDUtils {

    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    @Test
    public void test() {
        System.out.println(IDUtils.getId());
    }

}
