package com.ThinkingInJava.poly.cycle;

public class Cycle {
    private String name = "Cycle";

    public static void travel(Cycle cycle) {
        System.out.println("Cycle.ride() " + cycle);
    }

    public String toString() {
        return this.name;
    }
}
