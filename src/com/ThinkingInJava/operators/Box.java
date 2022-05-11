package com.ThinkingInJava.operators;

/*
Совмещаем имена при вызове методов
 */
class Box {
    float a;
}

class PassObject {
    static void f(Box y) {
        y.a = 4.2000f;
    }

    public static void main(String[] args) {
        Box x = new Box();
        x.a = 0.24f;
        System.out.println("1: x.a = " + x.a);
        f(x);
        System.out.println("2: x.a = " + x.a);
    }
}
