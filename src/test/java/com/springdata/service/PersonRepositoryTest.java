package com.springdata.service;

import com.springdata.domain.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonRepositoryTest {

    private ApplicationContext ctx = null;

    @Autowired
    private PersonRepository repository = null;

    {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        repository = ctx.getBean(PersonRepository.class);
    }



    @Test
    public void testGetByName(){
        Person person = repository.getByName("bb");
        System.out.println(person);
    }

    @Test
    public void testGetByLastNameEndingWithAndIdLessThan(){
        List<Person> list = repository.getByNameEndingWithAndAgeLessThan("a", 20);
        System.out.println(list.size());
    }

    @Test
    public void testGetByNameStartingWithAndAgeGreaterThan(){
        List<Person> list = repository.getByNameStartingWithAndAgeGreaterThan("a", 20);
        System.out.println(list.size());
    }

    @Test
    public void testGetByEmailInOrBirthLessThan(){
        List<String> list = new ArrayList<>();
        list.add("aa@126.com");
        list.add("bb@126.com");
        list.add("cc@126.com");
        List<Person> personList = repository.getByEmailInOrBirthLessThan(list, new Date());
        System.out.println(personList.size());
    }

}
