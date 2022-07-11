package com.ThinkingInJava.poly.rodents;

public class Shared {
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refCount++;
    }

    public String toString() {
        return "Shared " + id;
    }

    public void showRefCount() {
        System.out.println("refCount = " + refCount);
    }
}
