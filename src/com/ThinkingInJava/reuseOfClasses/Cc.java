package com.ThinkingInJava.reuseOfClasses;

class Aa {
    Aa(String name, int age) {
        System.out.println("A's constructor");
    }
}

class Bb extends Aa {
    Bb(String name, int age) {
        super(name, age);
        System.out.println("b's constructor");
    }
}

class Cc extends Aa {
    Cc(String name, char sex) {
        super("Den", 32);
        System.out.println("Cc's constructor");
    }

    Bb bb = new Bb("Nasy", 33);

    public static void main(String[] args) {
        Cc cc = new Cc("Ivan", 'M');
    }
}
