package com.example.board.ajax;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.annotations.ConstructorArgs;

@Getter
@Setter
public class Person {
    private String name;
    private int age;

    public Person(){}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
