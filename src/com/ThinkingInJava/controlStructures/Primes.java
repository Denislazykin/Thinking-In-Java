package com.ThinkingInJava.controlStructures;
/*
Программа расчитывает и выводит простые числа
 */
public class Primes {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            int factors = 0;
            for (int j = 1; j < (i + 2) / 2; j++) {
                if ((i % j) == 0) {
                    factors++;
                }
            }
            if (factors < 2) {
                System.out.println(i + " is prime");
            }
        }
    }
}