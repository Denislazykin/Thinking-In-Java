package com.ThinkingInJava.poly.frog;

public class LivingCreature {
    private Characteristic p = new Characteristic("living creature");
    private Description t = new Description("an ordinary living creature");

    public LivingCreature() {
        System.out.println("LivingCreature()");
    }

    protected void dispose() {
        System.out.println("dispose() in LivingCreature class");
        t.dispose();
        p.dispose();
    }
}
