package com.sparta.spring_mvc.Response;

import lombok.Getter;

@Getter
public class Star {
    String name;
    int age;

    public Star(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Star() {

    }
}