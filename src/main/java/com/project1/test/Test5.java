package com.project1.test;

import com.project1.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-autowire.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);

    }
}
