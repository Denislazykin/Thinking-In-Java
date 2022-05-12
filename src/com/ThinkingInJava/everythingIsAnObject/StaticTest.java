package com.ThinkingInJava.everythingIsAnObject;

public class StaticTest {
    static int i = 47;
    StaticTest st1 = new StaticTest();
    StaticTest st2 = new StaticTest();

    public static void main(String[] args) {
        StaticTest.i++;
        System.out.println(i);
    }

}
