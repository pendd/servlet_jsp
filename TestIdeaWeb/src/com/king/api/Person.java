package com.king.api;


import lombok.*;

/**
 * Created by pd on 2018/10/24 16:33
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;
    private int age;
    private Address address;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

}
