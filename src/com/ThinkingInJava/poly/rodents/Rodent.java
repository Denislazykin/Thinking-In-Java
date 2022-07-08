package com.ThinkingInJava.poly.rodents;

public class Rodent {
    private String name = "Rodent";

    public void run() {
        System.out.println("Rodent.run();");
    }

    public void jump() {
        System.out.println("Rodent.jump();");
    }

    public void climb() {
        System.out.println("Rodent.climb();");
    }

    @Override
    public String toString() {
        return "Rodent{" +
                "name='" + name + '\'' +
                '}';
    }
}
