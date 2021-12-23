package com.sunday.wiki.test;

import com.sunday.wiki.dto.PersonDTO;
import com.sunday.wiki.entity.Person;
import com.sunday.wiki.entity.User;
import com.sunday.wiki.mapper.PersonConverter;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * MapStruct测试
 *
 * @author wangfeng
 * @create 2021-08-05 13:25
 */
public class PersonConverterTest {

    @Test
    public void test() {

        Person person = new Person(1L, "sunday", "1141880334@qq.com", new Date(), new User(20));

        PersonDTO pDto = PersonConverter.INSTANCE.domain2dto(person);
        Assert.assertNotNull(pDto);
        Assert.assertEquals(pDto.getId(), person.getId());
        Assert.assertEquals(pDto.getName(), person.getName());
        Assert.assertEquals(pDto.getBirth(), person.getBirthday());
        String format = DateFormatUtils.format(pDto.getBirth(), "yyyy-MM-dd HH:mm:ss");
        Assert.assertEquals(pDto.getBirthDateFormat(), format);
        Assert.assertEquals(pDto.getBirthExpressionFormat(), format);

        List<Person> personList = new ArrayList<>();
        personList.add(person);

        List<PersonDTO> personDTOList = PersonConverter.INSTANCE.domain2dto(personList);

    }

}
