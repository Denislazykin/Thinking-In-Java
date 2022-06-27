package com.ThinkingInJava.reuseOfClasses.cadSystem;

public class Circle extends Shape {
    public Circle(int i) {
        super(i);
        System.out.println("Draw circle");
    }

    void dispose() {
        System.out.println("Erasing circle");
        super.dispose();
    }
}
