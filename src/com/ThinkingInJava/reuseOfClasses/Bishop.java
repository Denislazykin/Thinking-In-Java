package com.ThinkingInJava.reuseOfClasses;

import java.util.Random;

class Test {
    Test() {
        System.out.println("Test()");
    }
}

public class Bishop {
    private String name;

    public Bishop(String s) {
        name = s;
    }

    static final Test sft = new Test();
    private final Test ft = new Test();
    static final String SFS = "static final";
    private final String fs = "final";
    private static Random rand = new Random();
    static final int SFI = rand.nextInt();
    private final int fi = rand.nextInt();

    public String toString() {
        return (name + ": " + sft + ", " +
                ft + ", " +
                SFS + ", " + fs + ", " + SFI + ", " + fi);
    }

    public static void main(String[] args) {
        Bishop d1 = new Bishop("d1");
        Bishop d2 = new Bishop("d2");
        Bishop d3 = new Bishop("d3");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
