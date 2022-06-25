package com.ThinkingInJava.reuseOfClasses;

class Aa {
    Aa() {
        System.out.println("A's constructor");
    }
}

class Bb {
    Bb() {
        System.out.println("b's constructor");
    }
}

class Cc extends Aa {
    Bb bb = new Bb();

    public static void main(String[] args) {
        Cc cc = new Cc();
    }
}
