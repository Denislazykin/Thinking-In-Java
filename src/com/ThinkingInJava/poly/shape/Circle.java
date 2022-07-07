package com.ThinkingInJava.poly.shape;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void move() {
        System.out.println("Circle.move()");
    }
}
