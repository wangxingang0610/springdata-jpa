package com.springdata.service;

import com.springdata.domain.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        Person person = repository.getByName("aa");
        System.out.println(person);
    }


}
