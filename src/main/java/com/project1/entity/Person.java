package com.project1.entity;

import lombok.Data;

@Data
public class Person {
    private long id;
    private String name;
    private Car car;
}
