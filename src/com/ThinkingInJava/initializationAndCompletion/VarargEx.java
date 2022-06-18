package com.ThinkingInJava.initializationAndCompletion;

public class VarargEx {
    static void showStrings(String... args) {
        for (String s : args)
            System.out.print(s + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        showStrings("one", "TWO", "three", "four");
        showStrings(new String[]{"1", "2", "3", "4"});
    }
}
