package com.ThinkingInJava.initializationAndCompletion;
/*
АПД и перегрузка
 */
public class OverloadingVarargs {
    public static void f(Character... args){
        System.out.print("first");
        for (Character c : args) {
            System.out.print(" " + c);
        }
        System.out.println();
    }

    public static void f(Integer... args){
        System.out.print("second");
        for (Integer i : args) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    static void f(Long... args){
        System.out.println("third");
    }

    public static void main(String[] args) {
        f('a', 'b','c');
        f(1);
        f(2,1);
        f(0);
        f(0L);
        //f(); не скомпилирует эту строку, тк не может определить какой метод вызвать
    }
}
