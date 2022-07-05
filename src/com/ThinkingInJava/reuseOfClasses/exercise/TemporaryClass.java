package com.ThinkingInJava.reuseOfClasses.exercise;

public class TemporaryClass {
    private String s = "Original";

    public TemporaryClass() {
        s = "Original";
    }

    protected void changeS(String c) { // внешний пакет, только производный
        s = c;            // классы могут получить доступ к защищенному методу
    }

    public void showS() {
        System.out.println(s);
    }
}

class DeviceFail {
    public static void main(String[] s) {
        TemporaryClass fail = new TemporaryClass();
        fail.showS();
        // fail.changeS("good-bye"); // не удается получить доступ к защищенному методу
    }
}

