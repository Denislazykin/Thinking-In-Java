package com.ThinkingInJava.poly.frog;

public class Description {
    private String s;

    public Description(String s) {
        this.s = s;
        System.out.println("Create Description " + s);
    }

    protected void dispose() {
        System.out.println("Completing Description " + s);
    }
}
