package com.ThinkingInJava.reuseOfClasses;

class Poppet {
    private int i;

    public Poppet(int i) {
        this.i = i;
    }
}

public class BlankFinal {
    private final int i = 0; //инициализированная  константа
    private final int j; //пустая константа
    private final Poppet poppet; //пустая константа-ссылка
    // Пустые констранты необходимо инициализировать в конструкторе


    public BlankFinal() {
        j = 1; //Инициализация пустой констранты
        poppet = new Poppet(1); //иниализация пустой неизменной ссылки
    }

    public BlankFinal(int x) {
        j = x; //инициализация пустой константы
        poppet = new Poppet(x); //инициализация пустой неизмененной ссылки
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}
