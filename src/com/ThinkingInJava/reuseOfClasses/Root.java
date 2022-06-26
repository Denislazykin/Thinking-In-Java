package com.ThinkingInJava.reuseOfClasses;

public class Root {
    Component1 component1Root = new Component1(164);
    Component2 component2Root = new Component2(52);
    Component3 component3Root = new Component3(33);

    public Root(String name, int age) {
        component1Root = new Component1(0);
        component2Root = new Component2(0);
        component3Root = new Component3(0);
        System.out.println("Root constructor");
    }
}

class Component1 {
    public Component1(int height) {
        System.out.println("Component1 constructor");
    }
}

class Component2 {
    public Component2(int weight) {
        System.out.println("Component2 constructor");
    }
}

class Component3 {
    public Component3(int volume) {
        System.out.println("Component3 constructor");
    }
}

class Stem extends Root {
    Component1 component1Stem = new Component1(195);
    Component2 component2Stem = new Component2(77);
    Component3 component3Stem = new Component3(60);

    Stem(String country) {
        super("", 0);
        component1Stem = new Component1(1);
        component2Stem = new Component2(1);
        component3Stem = new Component3(1);
        System.out.println("Stem constructor");
    }

    public static void main(String[] args) {
        Stem stem = new Stem("RF");
        Root root = new Root("Den", 32);
    }
}
