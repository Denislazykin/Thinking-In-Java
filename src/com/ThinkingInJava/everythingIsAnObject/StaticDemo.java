package com.ThinkingInJava;

public class StaticDemo {
    static int age = 18;

    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
        StaticDemo staticDemo1 = new StaticDemo();
        StaticDemo staticDemo2 = new StaticDemo();
        System.out.println(age);
    }
}
