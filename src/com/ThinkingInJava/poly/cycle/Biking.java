package com.ThinkingInJava.poly.cycle;

public class Biking {
    public static void ride(Cycle cycle) {
        cycle.travel(cycle);
    }

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        ride(unicycle);
        ride(bicycle);
        ride(tricycle);
    }
}
