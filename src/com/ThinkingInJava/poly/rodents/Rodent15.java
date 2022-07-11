package com.ThinkingInJava.poly.rodents;

public class Rodent15{
    private static RandomRodentGenerator gen = new RandomRodentGenerator();

    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[5];
        for (Rodent r : rodents) {
            r = gen.next();
            System.out.println(r);
        }
        gen.shared.showRefCount();
    }
}
