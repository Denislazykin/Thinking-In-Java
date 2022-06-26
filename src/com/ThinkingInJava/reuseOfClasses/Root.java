package com.ThinkingInJava.reuseOfClasses;

public class Root {
    Component1 component1Root = new Component1();
    Component2 component2Root = new Component2();
    Component3 component3Root = new Component3();

    public Root() {
        System.out.println("Root constructor");
    }
}

class Component1 {
    public Component1() {
        System.out.println("Component1 constructor");
    }
}

class Component2 {
    public Component2() {
        System.out.println("Component2 constructor");
    }
}

class Component3 {
    public Component3() {
        System.out.println("Component3 constructor");
    }
}

class Stem extends Root {
    Component1 component1Stem = new Component1();
    Component2 component2Stem = new Component2();
    Component3 component3Stem = new Component3();

    Stem() {
        System.out.println("Stem constructor");
    }

    public static void main(String[] args) {
        Stem stem = new Stem();
        Root root = new Root();
    }
}
