package com.ThinkingInJava.operators;
/*
Вывод наибольшего и наименьшего числа в экспоненциальной записи
 */
public class ExponentialNumber {
    public static void main(String[] args) {
        double maxDouble = 1.7e+308;
        double minDouble = 4.9e-324;
        float maxFloat = 3.4e+38f;
        float minFloat = 1.4e-45f;
        System.out.println(maxDouble);
        System.out.println(minDouble);
        System.out.println(maxFloat);
        System.out.println(minFloat);
    }
}
