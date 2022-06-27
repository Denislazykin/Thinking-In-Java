package com.ThinkingInJava.reuseOfClasses;

public class Class {
    int age;
    String name;
    char sex;
    float distance;

    void method(int age){
        System.out.println("method(int age)");
    }
    void method(String name){
        System.out.println("method(String name)");
    }
    void method(char sex){
        System.out.println("method(char sex)");
    }
}
class NewClass extends Class{
    void method(float distance){
        System.out.println("method(float distance)");
    }

    public static void main(String[] args) {
        NewClass newClass = new NewClass();
        newClass.method(44.44f);
        newClass.method('M');
        newClass.method("Den");
        newClass.method(32);
    }
}
