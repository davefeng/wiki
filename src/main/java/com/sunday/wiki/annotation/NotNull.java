package com.sunday.wiki.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义非空 注解
 *
 * @author wangfeng
 * @create 2021-11-16 16:53
 */
@Target(value = ElementType.PARAMETER)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface NotNull {

    String value();

}
