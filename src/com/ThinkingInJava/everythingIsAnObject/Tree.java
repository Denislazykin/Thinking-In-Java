package com.ThinkingInJava.everythingIsAnObject;

/**
 * создаем дерево типов с двумя конструкторами и одним информационным методом
 */
class Tree {
    int height;

    /**
     * конструктор без аргументов
     * присваивает высоту = 0
     */
    Tree() {
        System.out.println("Planting a seedling");
        height = 0;
    }

    /**
     * конструктор, принимающий аргумент int,
     * присваивает высоту этому аргументу int
     */
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new tree that is " + height + " feet tall");
    }

    /**
     * способ печати высоты древовидного объекта
     */
    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    /**
     * перегруженный метод для вывода строкового аргумента
     * и высота древовидного объекта
     */
    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}

/**
 * класс для тестирования построения древовидных объектов
 */
class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloading method");
        }
        // Перегруженный конструктор:
        new Tree();
    }
}
