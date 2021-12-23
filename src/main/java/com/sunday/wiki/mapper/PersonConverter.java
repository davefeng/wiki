package com.sunday.wiki.mapper;

import com.sunday.wiki.dto.PersonDTO;
import com.sunday.wiki.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * PersonConverter实体类转换
 *
 * @author wangfeng
 * @create 2021-08-05 10:34
 */
@Mapper
public interface PersonConverter {

    PersonConverter INSTANCE = Mappers.getMapper(PersonConverter.class);

    /**
     * 这是一个单实体映射方法Person转PersonDTO
     * 1.若源对象名和目标对象属性一致，会自动映射对应属性，像Person和PersonDTO里的id，mame，email是一样的，则在Mappings里没有指定。
     * 2.若源对象名和目标对象属性不一致，则需要指定，也可以用format转成自己想要的类型例如下面的第二个mapping，也支持表达式方式例如下面的第三个mapping。
     * 3.如果有属性不想映射，则加个ignore = true即可。
     * @param person 参数
     * @return
     */
    @Mappings({
            @Mapping(source = "birthday", target = "birth"),
            @Mapping(source = "birthday", target = "birthDateFormat", dateFormat = "yyyy-MM-DD HH:mm:ss"),
            @Mapping(target = "birthExpressionFormat", expression = "java(org.apache.commons.lang3.time.DateFormatUtils.format(person.getBirthday(),\"yyyy-MM-dd HH:mm:ss\"))"),
            @Mapping(source = "user.age", target = "age"),
            @Mapping(target = "email", ignore = true)
    })
    PersonDTO domain2dto(Person person);

    /**
     * Person类的集合转换成PersonDTO类的集合
     * @param list Person类的集合
     * @return
     */
    List<PersonDTO> domain2dto(List<Person> list);

}
