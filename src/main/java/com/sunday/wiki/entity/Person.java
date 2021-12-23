package com.sunday.wiki.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Person实体类
 *
 * @author wangfeng
 * @create 2021-08-05 10:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private Long id;

    private String name;

    private String email;

    private Date birthday;
    
    private User user;

}
