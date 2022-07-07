package com.ThinkingInJava.poly.shape;

public class Shapes {
    private static final RandomShapeGenerator generator = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        // заполняем массив фигурами
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = generator.next();
        }
        //полиморфные вызовы методов
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
