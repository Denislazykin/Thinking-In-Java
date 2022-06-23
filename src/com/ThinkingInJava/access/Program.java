package com.ThinkingInJava.access;
/*
Определяем класс в пакете.
Создаем экземпляр класса за пределами пакета
 */
public class Program {
    public static void main(String[] args) {
        Person kate = new Person("Kate", 32);
        kate.displayInfo();
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.printf("Name: %s \t Age: %d \n", name, age);
    }
}
