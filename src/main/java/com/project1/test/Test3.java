package com.project1.test;

import com.project1.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test3 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-p.xml");
        Student student = (Student)applicationContext.getBean("student");
        System.out.println(student);
    }
}
