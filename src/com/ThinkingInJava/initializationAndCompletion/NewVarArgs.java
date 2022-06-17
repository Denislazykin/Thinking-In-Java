package com.ThinkingInJava.initializationAndCompletion;

/*
Создание списков аргументов переменной длины
с использованием синтаксиса массивов
 */
public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // можно передать отдельные элементы
        printArray((47), (3.14F), (11.11));
        printArray(47, 3.14F, 11.11);
        printArray("one", "two", "three");
        printArray(new A(), new A(), new A());
        //или массив
        printArray((Object[]) new Integer[]{1, 2, 3, 4});
        //или пустой список
        printArray();
    }
}
