package com.ThinkingInJava.reuseOfClasses.detergent;

/*
Синтаксис наследования и его свойства
 */
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
