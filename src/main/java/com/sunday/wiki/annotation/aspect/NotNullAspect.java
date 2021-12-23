package com.sunday.wiki.annotation.aspect;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

/**
 * 自定义非空注解aop实现
 *
 * @author wangfeng
 * @create 2021-11-16 16:56
 */
@Component
@Aspect
public class NotNullAspect {

    @Pointcut("execution(* com.sunday.wiki.*(..))")
    public void ParamCheck(){}

}
