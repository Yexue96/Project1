package com.project1.test;

import com.project1.entity.Student;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static  void main(String[] arg){
        //Student student = new Student();
        //student.setId(1);
        //student.setName("WangZiWei");
        //student.setAge(22);
        //System.out.println(student);

        //加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        Student student = (Student) applicationContext.getBean("student2");
        System.out.println(student);

    }
}
