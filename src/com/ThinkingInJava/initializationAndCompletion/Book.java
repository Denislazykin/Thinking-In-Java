package com.ThinkingInJava.initializationAndCompletion;

public class Book {
    public Book() {
        System.out.println("Object is created");
    }

    public Book(String s) {
        System.out.println("Object is created " + s);
    }

    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book("GodGather");
    }
}
