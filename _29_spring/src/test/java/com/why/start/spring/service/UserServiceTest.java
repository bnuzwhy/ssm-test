package com.why.start.spring.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserServiceTest {

    @Test
    public void test(){
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        final UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        userService.del();
    }

}