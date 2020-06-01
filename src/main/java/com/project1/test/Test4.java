package com.project1.test;

import com.project1.entity.Car;
import com.project1.factory.InstanceCarFactory;
import com.project1.factory.StaticCarFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args){
        //static factory
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-factory.xml");
        Car car = (Car)applicationContext.getBean("car");
        System.out.println(car);

        //Instance factory
//        InstanceCarFactory instanceCarFactory = new InstanceCarFactory();
//        Car car = (Car) instanceCarFactory.getCar(1L);
//        System.out.println(car);
    }
}
