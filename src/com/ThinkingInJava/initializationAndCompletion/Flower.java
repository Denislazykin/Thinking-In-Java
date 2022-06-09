package com.ThinkingInJava.initializationAndCompletion;

public class Flower {
    int age;
    String name;

    public Flower(int age, String name) {
        this("nezabudka", 2);
        this.age = age;
        this.name = name;
    }

    public Flower(String name, int age) {
        this.age = age;
        this.name = name;

    }

    public static void main(String[] args) {
        Flower flower = new Flower(12, "mary");
    }
}
