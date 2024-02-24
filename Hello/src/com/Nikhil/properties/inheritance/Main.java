package com.Nikhil.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        System.out.println(box1.l +" " + box1.w + " " + box1.h);

        Box box2 = new Box(2, 3, 5);
//        System.out.println(box2.l +" " + box2.w + " " + box2.h);

        BoxWeight box3 = new BoxWeight(2, 3, 5, 7);
//        System.out.println(box3.w);

//        BoxPrice box4 = new BoxPrice(5, 8, 200);

        box2.greeting();
        box3.greeting();
        BoxWeight.greeting();
        Box.greeting();
    }
}
