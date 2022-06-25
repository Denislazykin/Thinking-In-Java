package com.ThinkingInJava.reuseOfClasses;

/*
Синтаксис наследования и его свойства
 */
class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser c = new Cleanser();
        c.dilute();
        c.apply();
        c.scrub();
        System.out.println(c);
    }
}

public class Detergent extends Cleanser {
    //Изменяем метод
    public void scrub() {
        append(" Detergent.scrub()");
        //вызываем метод базового класс
        super.scrub();
    }

    //Добавляем новые методы к интерфейсу
    public void foam() {
        append(" foam()");
    }

    //Проверяем новый класс
    public static void main(String[] args) {
        Detergent d = new Detergent();
        d.dilute();
        d.apply();
        d.scrub();
        d.foam();
        System.out.println(d);
        System.out.println("Checking the base class");
        Cleanser.main(args);
    }
}

class Sterilizer extends Detergent{
    public void scrub() {
        append(" Sterilizer.scrub()");
        super.scrub();
    }
    public void sterilize() {
        append(" sterilize()");
    }

    public static void main(String[] args) {
        Sterilizer s = new Sterilizer();
        s.dilute();
        s.apply();
        s.scrub();
        s.foam();
        s.sterilize();
        System.out.println(s);
        System.out.println("Testing base class:");
        Detergent.main(args);
    }
}
