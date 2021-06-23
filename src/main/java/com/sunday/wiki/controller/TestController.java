package com.sunday.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试hello world接口
 *  1.@RestController 返回一个字符串
 *  2.@Controller 返回一个页面
 *  3.@ResponseBody 返回一个字符串或者是json对象
 * @author wangfeng
 * @create 2021-06-22 10:34
 */
@RestController
public class TestController {

    @Value("${test.hello}")
    private String testhello;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello () {
        return "hello world! " + testhello;
    }

    @RequestMapping(value = "/hello/post", method = RequestMethod.POST)
    public String hello (String name) {
        return "hello davefeng! " + name;
    }

}
