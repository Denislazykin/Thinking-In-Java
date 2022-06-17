package com.ThinkingInJava.initializationAndCompletion;
/*
Создали массив объектов String
Присваиваем объект каждому элементу
Выводим содержимое массива
 */
import java.util.Arrays;

public class ArrayInit {
    public static void main(String[] args) {
        String[] strings = {"let's", "go", "learn", "Java"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println("strings[" + i + "] = " + strings[i]);
        }
    }
}
