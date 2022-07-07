package com.ThinkingInJava.poly.shape;

import java.util.Random;

/*
Фабрика, случайным образом создающая объекты
 */
public class RandomShapeGenerator {
    private Random random = new Random(47);

    public Shape next() {
        switch (random.nextInt(4)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            case 3:
                return new Rectangle();
        }
    }
}
