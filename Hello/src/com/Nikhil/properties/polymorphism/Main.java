package com.Nikhil.properties.polymorphism;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square();

        shape.area();
        circle.area();
        square.area();
    }
}
