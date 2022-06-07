package com.ThinkingInJava.initializationAndCompletion;

/*
Инициализациия в точке определения
и в конструкторе.
 */
public class StringInit2 {
    String string;
    String string1 = "hello";
    String string2;

    public StringInit2() {
        string2 = "good bye";
    }

    public static void main(String[] args) {
        StringInit2 stringInit2 = new StringInit2();
        System.out.println("stringInit2.string: " + stringInit2.string);
        System.out.println("stringInit2.string1: " + stringInit2.string1);
        System.out.println("stringInit2.string2: " + stringInit2.string2);
    }
}
