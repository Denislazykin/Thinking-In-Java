package com.ThinkingInJava.reuseOfClasses;

class Shmempty{
    private int i;

    public Shmempty(int i) {
        this.i = i;
    }
}
public class Empty {
    private final Shmempty shmempty;

    public Empty() {
        shmempty = new Shmempty(1);
    }

    public Empty(int x) {
        shmempty = new Shmempty(x);
    }

    public static void main(String[] args) {
        Empty empty = new Empty();
        Empty empty1 = new Empty(47);
        //empty.shmempty = new Empty(2); -не сработает, ошибка
        //empty.shmempty = new Empty(3); -несовместимости типов
        System.out.println("empty.shmempty" + empty.shmempty);
        System.out.println("empty1.shmempty" + empty1.shmempty);
    }
}
