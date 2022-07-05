package com.ThinkingInJava.reuseOfClasses.exercise;

public class Device extends TemporaryClass {
    void changeBasic(String t) {
        super.changeS(t); // вызывает защищенный метод
    }

    public static void main(String[] args) {
        Device d = new Device();
        d.showS();
        d.changeBasic("Changed"); // производный класс может получить доступ к защищенному
        d.showS();
        DeviceFail.main(args);
    }
}
