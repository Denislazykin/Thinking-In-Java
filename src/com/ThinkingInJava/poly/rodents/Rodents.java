package com.ThinkingInJava.poly.rodents;

public class Rodents {
    private static RandomRodentGenerator generator = new RandomRodentGenerator();
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[2];
        for (Rodent rodent : rodents) {
            rodent = generator.next();
            System.out.println(rodent + ": ");
            rodent.climb();
            rodent.jump();
            rodent.run();
        }
    }
}
