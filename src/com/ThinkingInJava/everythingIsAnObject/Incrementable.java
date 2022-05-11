package com.ThinkingInJava;

public class Incrementable {
    static void increment() {
        StaticTest.i++;
    }

    public static void main(String[] args) {
        Incrementable incrementable = new Incrementable();
        increment();
        System.out.println(StaticTest.i);
    }
}
