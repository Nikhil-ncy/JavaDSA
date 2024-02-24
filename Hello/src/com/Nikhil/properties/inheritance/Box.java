package com.Nikhil.properties.inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box() {
        this.l = -1.0;
        this.w = -1;
        this.h = -1;
    }

    static void greeting(){
        System.out.println("Hello I am in Box class. Greetings!");
    }

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(Box other){
        this.l = other.l;
        this.w = other.w;
        this.h = other.h;
    }
}
