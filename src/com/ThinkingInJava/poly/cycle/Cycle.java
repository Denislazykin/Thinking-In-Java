package com.ThinkingInJava.poly.cycle;

public class Cycle {
    private String name = "Cycle";
    private int wheels = 0;

    public int wheels(){
        return wheels;
    }

    public static void travel(Cycle cycle) {
        System.out.println("Cycle.travel() " + cycle);
    }

    public String toString() {
        return this.name;
    }
}
