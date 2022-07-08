package com.ThinkingInJava.poly.rodents;

import java.util.Random;

public class RandomRodentGenerator {
    private Random random = new Random(47);

    public Rodent next() {
        switch (random.nextInt(2)) {
            default:
            case 0:
                return new Mouse();
            case 1:
                return new Hamster();
        }
    }
}
