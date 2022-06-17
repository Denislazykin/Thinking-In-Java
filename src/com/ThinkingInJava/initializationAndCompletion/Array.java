package com.ThinkingInJava.initializationAndCompletion;

/*
Создали класс с конструктором, получающий аргумент String
Выводим значение аргумента во время конструирования
Создаем массив ссылок на этот класс,
но не создаем объекты, которые заполнят массив.

UPD. создал объекты, которыми заполняется массив
 */
public class Array {
    public Array(String s) {
        System.out.println("Array()");
        System.out.println(s);
    }
}

class ArrayTest {
    public static void main(String[] args) {
        Array[] arrayTest = new Array[4];
        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = new Array(Integer.toString(i));
        }
    }
}