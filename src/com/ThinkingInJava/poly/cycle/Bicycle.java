package com.ThinkingInJava.poly.cycle;

public class Bicycle extends Cycle {
    private String name = "Bicycle";
    private int wheels = 2;

    @Override
    public int wheels() {
        return wheels;
    }

    public String toString() {
        return this.name;
    }
}
