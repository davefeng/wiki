package com.sunday.wiki.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * PersonDTO
 *
 * @author wangfeng
 * @create 2021-08-05 10:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    private String name;

    /**
     * 对应Person.user.age
     */
    private Integer age;

    private String email;

    /**
     * 与Person里的birthday不一致
     */
    private Date birth;

    /**
     * 对Person里的birthday进行拓展，dateFormat的形式
     */
    private String birthDateFormat;

    /**
     * 对Person里的birthday进行拓展，expression的形式
     */
    private String birthExpressionFormat;

}
