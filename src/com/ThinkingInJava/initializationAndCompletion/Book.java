package com.ThinkingInJava.initializationAndCompletion;

public class Book {
    public Book() {
        System.out.println("Object is created");
    }

    public static void main(String[] args) {
        Book book = new Book();
    }
}
