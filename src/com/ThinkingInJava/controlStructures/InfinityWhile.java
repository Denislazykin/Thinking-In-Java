package com.ThinkingInJava.controlStructures;

public class InfinityWhile {
    public static void main(String[] args) {
        InfinityWhile rand3 = new InfinityWhile();
        InfinityWhile rand4 = new InfinityWhile();
        while (true) {
            int x = rand3.nextInt(10);
            int y = rand4.nextInt(10);
            if (x < y) {
                System.out.println(x + " < " + y);
            } else if (x > y) {
                System.out.println(x + " > " + y);
            } else {
                System.out.println(x + " = " + y);
            }
        }
    }

    private int nextInt(int i) {
        return 0;
    }
}
