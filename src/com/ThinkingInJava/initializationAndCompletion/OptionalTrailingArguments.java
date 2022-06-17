package com.ThinkingInJava.initializationAndCompletion;
/*
Использование списков аргументов переменной среды
с типом отличным от Object
 */
public class OptionalTrailingArguments {
    static void f(int required, String ... trailing) {
        System.out.print("Always: " + required + " ");
        for (String s : trailing) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, "one");
        f(2, "two", "three");
        f(0);
    }
}
