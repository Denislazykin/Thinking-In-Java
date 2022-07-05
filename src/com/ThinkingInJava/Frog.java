package com.ThinkingInJava;

class Amphibian {
    protected void swim() {
        System.out.println("Amphibian swim");
    }

    protected void speak() {
        System.out.println("Amphibian speak");
    }

    void eat() {
        System.out.println("Amphibian eat");
    }

    static void grow(Amphibian a) {
        System.out.println("Amphibian grow");
        a.eat();
    }
}

public class Frog extends Amphibian {
    @Override
    protected void swim() {
        super.swim();
        System.out.println("I'm frog, and i swim");
    }

    @Override
    protected void speak() {
        super.speak();
        System.out.println("I'm frog, and i swim");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("I'm frog, and i eat");
    }

    static void grow(Amphibian a) {
        System.out.println("Amphibian grow");
        a.eat();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.eat();
        System.out.println();
        frog.grow(frog);
        System.out.println();
        Amphibian.grow(frog);
    }
}


