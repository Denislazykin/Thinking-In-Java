package com.ThinkingInJava.reuseOfClasses;

class A {
    A() {
        System.out.println("A()");
    }
}

class B extends A {
    B() {
        System.out.println("B()");
    }
}

class C extends B {
    C() {
        System.out.println("C()");
    }
}

class D extends C {
    D() {
        System.out.println("D()");
    }

    public static D makeD() {
        return new D();
    }

    public static void main(String[] args) {
        D d = new D();
        D d2 = makeD();
    }
}

public class E extends D {
    E() {
        System.out.println("E()");
    }

    public static void main(String[] args) {
        E e = new E();
        // test D:
        D.main(args);
    }
}
