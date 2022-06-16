package com.ThinkingInJava.initializationAndCompletion;
/*
  Создание массива непримитивных объектов
 */
import java.util.Arrays;
import java.util.Random;

class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(500);
        Integer[] a = new Integer[rand.nextInt(40)];
        System.out.println("length a = " + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(1000);
        }
        System.out.println(Arrays.toString(a));
    }
}
