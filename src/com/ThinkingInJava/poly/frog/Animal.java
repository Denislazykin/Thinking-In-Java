package com.ThinkingInJava.poly.frog;

public class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("have a heart");
    private Description t = new Description("an animal, not a plant");

    public Animal() {
        System.out.println("Animal()");
    }

    protected void dispose() {
        System.out.println("dispose() in Animal class");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
