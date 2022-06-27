package com.ThinkingInJava.reuseOfClasses.cadSystem;

public class Triangle extends Shape {
    public Triangle(int i) {
        super(i);
        System.out.println("Draw triangle");
    }

    void dispose() {
        System.out.println("Erasing triangle");
        super.dispose();
    }
}
