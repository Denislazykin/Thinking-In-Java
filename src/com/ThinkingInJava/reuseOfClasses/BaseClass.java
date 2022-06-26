package com.ThinkingInJava.reuseOfClasses;

public class BaseClass {
    BaseClass(String name, int age) {
        System.out.println("BaseClass constructor");
    }
}

class DerivedClass extends BaseClass {
    DerivedClass() {
        super("Caty", 30);
        System.out.println("Derived class constructor without arguments");
    }

    DerivedClass(String name) {
        super("", 0);
        System.out.println("Derived class constructor with arguments");
    }

    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();
        DerivedClass derivedClass1 = new DerivedClass("Den");
    }
}
