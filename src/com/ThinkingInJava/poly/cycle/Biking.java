package com.ThinkingInJava.poly.cycle;

public class Biking {
    public static void ride(Cycle cycle) {
        cycle.travel(cycle);
        System.out.println("Wheels: " + cycle.wheels());
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
