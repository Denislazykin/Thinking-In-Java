package com.ThinkingInJava;

class Frog extends Amphibian {
    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian.dropSkin(frog);
        Amphibian.eat(frog);
    }
}

public class Amphibian {
    public static void dropSkin(Amphibian amphibian) {
        System.out.println("I'm drop my skin");
    }

    public static void eat(Amphibian amphibian) {
        System.out.println("I'm eating");
    }
}
