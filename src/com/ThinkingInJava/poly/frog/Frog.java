package com.ThinkingInJava.poly.frog;

public class Frog extends Amphibian {
    private Characteristic p = new Characteristic("kva");
    private Description t = new Description("eats bugs ");

    public Frog() {
        System.out.println("Frog()");
    }

    protected void dispose() {
        System.out.println("dispose() in Frog class");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("Bye!");
        frog.dispose();
    }
}
