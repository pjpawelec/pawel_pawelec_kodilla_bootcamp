package com.kodilla.spring.intro.shape;

public class Trangle implements Shape {

    @Override
    public String draw() {
        System.out.println("This is a triangle");
        return "This is a trangle";
    }
}
