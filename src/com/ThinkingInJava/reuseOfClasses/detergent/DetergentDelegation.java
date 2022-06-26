package com.ThinkingInJava.reuseOfClasses.detergent;

public class DetergentDelegation {
    private String name;
    private Cleanser controls = new Cleanser();

    public DetergentDelegation(String name) {
        this.name = name;
    }

    public void append(String a) {
        name += a;
    }

    public void dilute() {
        controls.dilute();
    }

    public void apply() {
        controls.apply();
    }

    public void scrub() {
        controls.scrub();
    }

    public void foam() {
        append(" foam() ");
    }

    public static void main(String[] args) {
        DetergentDelegation fary = new DetergentDelegation("Fary");
        fary.dilute();
        fary.apply();
        fary.scrub();
        fary.foam();
        System.out.print(fary);
        System.out.print(" Testing base class ");
        Cleanser.main(args);
    }
}
