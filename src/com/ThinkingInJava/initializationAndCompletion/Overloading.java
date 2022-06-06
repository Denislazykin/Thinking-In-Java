package com.ThinkingInJava.initializationAndCompletion;

class Tree {
    int height;

    Tree() {
        System.out.println("grow groot");
        height = 0;
    }

    Tree(int initHeight) {
        height = initHeight;
        System.out.println("Create new tree " + height + " meters");
    }

    void info() {
        System.out.println("Tree is " + height + " meters");
    }

    void info(String s) {
        System.out.println(s + " Height tree is " + height + " meters");
    }
}

public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree tree = new Tree(i);
            tree.info();
            tree.info("Overloading method");
        }
        new Tree(); //перегруженный конструктор
    }
}
