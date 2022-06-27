package com.ThinkingInJava.reuseOfClasses;

public class Root {
    Component1 component1Root;
    Component2 component2Root;
    Component3 component3Root;

    public Root() {
        System.out.println("Root constructor");
        component1Root = new Component1();
        component2Root = new Component2();
        component3Root = new Component3();
    }

    void dispose() {
        component3Root.dispose();
        component2Root.dispose();
        component1Root.dispose();
        System.out.println("Root.dispose()");
    }
}

class Component1 {
    public Component1() {
        System.out.println("Component1 constructor");
    }

    void dispose() {
        System.out.println("Component1.dispose()");
    }
}

class Component2 {
    public Component2() {
        System.out.println("Component2 constructor");
    }

    void dispose() {
        System.out.println("Component2.dispose()");
    }
}

class Component3 {
    public Component3() {
        System.out.println("Component3 constructor");
    }

    void dispose() {
        System.out.println("Component3.dispose()");
    }
}

class Stem extends Root {
    Component1 component1Stem;
    Component2 component2Stem;
    Component3 component3Stem;

    Stem() {
        super();
        System.out.println("Stem constructor");
        component1Stem = new Component1();
        component2Stem = new Component2();
        component3Stem = new Component3();
    }

    void dispose(){
        component3Stem.dispose();
        component2Stem.dispose();
        component1Stem.dispose();
        System.out.println("Stem.dispose()");
    }

    public static void main(String[] args) {
        Stem stem = new Stem();
        try {
            // Code and exception handling...
        } finally {
            stem.dispose();
        }
    }
}
