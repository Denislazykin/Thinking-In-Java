package com.ThinkingInJava.poly.classes;

public class BaseClass {
    protected void first() {
        System.out.println("BaseClass.first();");
        this.second();
    }

    protected void second() {
        System.out.println("BaseClass.second();");
    }
}
