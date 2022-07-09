package com.ThinkingInJava.poly.frog;

public class Amphibian extends Animal{
    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("both in the water and on the ground");

    public Amphibian() {
        System.out.println("Amphibian()");
    }

    protected void dispose() {
        System.out.println("dispose() in Amphibian class");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
