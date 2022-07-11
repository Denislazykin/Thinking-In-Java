package com.ThinkingInJava.poly.rodents;

import java.util.Random;

public class RandomRodentGenerator {
    // same shared object to be passed to every Rodent:
    protected Shared shared = new Shared();
    private Random random = new Random(47);

    public Rodent next() {
        switch (random.nextInt(2)) {
            default:
            case 0:
                return new Mouse(shared);
            case 1:
                return new Hamster(shared);
        }
    }
}
