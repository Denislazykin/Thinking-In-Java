package com.ThinkingInJava;

/**
 * Печатаем значения не инициализированных переменных
 */
public class People {
    int age;
    char sex;

    public static void main(String[] args) {
        People people = new People();
        System.out.println(people.age);
        System.out.println(people.sex);
    }
}
