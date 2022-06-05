package com.ThinkingInJava.controlStructures;

public class ForUsageWithBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i == 99) break;
        }

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i == 99) return;
        }
    }
}
