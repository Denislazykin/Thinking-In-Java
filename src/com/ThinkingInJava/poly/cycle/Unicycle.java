package com.ThinkingInJava.poly.cycle;

public class Unicycle extends Cycle {
    private String name = "Unicycle";
    private int wheels = 1;

    @Override
    public int wheels() {
        return wheels;
    }

    public String toString() {
        return this.name;
    }
}
