package com.springdata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class Test {


    private ApplicationContext ctx = null;


    {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

    }


    @org.junit.Test
    public void testDataSource() throws Exception {
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());
    }
}
