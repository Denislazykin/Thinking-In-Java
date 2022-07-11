package com.ThinkingInJava.poly.referenceCounting;

public class Shared {
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Create " + this);
    }

    public void addRef() {
        refCount++;
    }

    @SuppressWarnings("removal")
    @Override
    protected void finalize() {
        if (refCount > 0)
            System.out.println("Error: " + refCount + " Shared " + id + " objects in use");
    }

    protected void dispose() {
        if (--refCount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}
