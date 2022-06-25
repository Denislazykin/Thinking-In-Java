package com.ThinkingInJava.reuseOfClasses;

/*
Вызов конструктора при проведении наследования
 */
class Art {
    Art() {
        System.out.println("Art's constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing's constructor");
    }
}

public class Cartoon extends Drawing {
    public Cartoon() {
        System.out.println("Cartoon's constructor");
    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}
