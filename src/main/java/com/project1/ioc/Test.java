package com.project1.ioc;

import com.project1.entity.Student;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./src/main/resources/Spring.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
    }
}
