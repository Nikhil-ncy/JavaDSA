package com.Nikhil.properties.polymorphism;

public class Circle extends Shapes{

    @Override
    void area(){
        System.out.println("Area is pi * r^2");
    }
}
