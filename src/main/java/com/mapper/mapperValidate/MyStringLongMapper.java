package com.mapper.mapperValidate;

import org.springframework.util.StringUtils;

/**
 * 方法中target和source 类型满足 MyStringLongMapper 中的方法时,
 * 会自动进行调用MyStringLongMapper里面的方法进行类型转换处理。
 * target = 入参
 * source = 出参
 */
public class MyStringLongMapper {

    public Integer stringToInteger(String data) {
        return !StringUtils.isEmpty(data) ? Integer.parseInt(data) : null;
    }

    public Long stringToLong(String data) {
        return !StringUtils.isEmpty(data) ? Long.parseLong(data) : null;
    }

    public String stringToString(String data) {
        return !StringUtils.isEmpty(data) ? data : null;
    }
}
