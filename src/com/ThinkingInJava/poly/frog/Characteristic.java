package com.ThinkingInJava.poly.frog;

public class Characteristic {
    private String s;

    public Characteristic(String s) {
        this.s = s;
        System.out.println("Create Characteristic " + s);
    }

    protected void dispose() {
        System.out.println("Completing Characteristic " + s);
    }
}
