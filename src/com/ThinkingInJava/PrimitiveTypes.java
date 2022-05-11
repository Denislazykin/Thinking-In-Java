package com.ThinkingInJava;

/**
 * Авто упаковка примитивных типов
 */
public class PrimitiveTypes {
    public static void main(String[] args) {
        int a = 5;
        Integer b = 10;
        a = b;             // OK, атораспаковка
        b = a * 123;       // OK, автоупаковка
    }
}
