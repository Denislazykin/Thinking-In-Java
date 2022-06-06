package com.ThinkingInJava.controlStructures;
/*
Написал метод, который получает целочисленный аргумент
и выводит указанное количество чисел Фибоначи
 */
public class Fibonacci {
    int fib(int n) {
        if(n < 2) return 1;
        return (fib(n - 2) + fib(n - 1));
    }
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        double k = 800;
        System.out.println("First " + k + " Fibonacci number(s): ");
        for(int i = 0; i < k; i++)
            System.out.println(f.fib(i));
    }
}
