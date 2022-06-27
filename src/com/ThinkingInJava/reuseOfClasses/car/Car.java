package com.ThinkingInJava.reuseOfClasses.car;

/*
Класс описывает, что умеет делать машина
 */
public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door();
    public Door right = new Door();

    public Car() {
        for (int i = 0; i < 4; i++) {
            wheel[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.doorWindow.rollup();
        car.wheel[0].inflate(47);
        car.engine.service();
    }
}
