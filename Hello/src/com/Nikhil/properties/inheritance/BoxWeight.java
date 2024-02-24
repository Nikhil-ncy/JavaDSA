package com.Nikhil.properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);
        this.weight = weight;
    }

    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

//    @Override
    static void greeting(){
        System.out.println("Hello I am in Box class. Greetings!");
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
}
