package com.ThinkingInJava.operators;

public class Dog {
    String name;
    String says;

    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        spot.name = "Spot";
        scruffy.name = "Scruffy";
        spot.says = "Tyaf";
        scruffy.says = "Gaav";
        System.out.println(scruffy.name + " " + scruffy.says);
        System.out.println(spot.name + " " + spot.says);
        Dog jack = spot;
        System.out.println(jack == spot);
        System.out.println(jack.equals(spot));
    }
}
