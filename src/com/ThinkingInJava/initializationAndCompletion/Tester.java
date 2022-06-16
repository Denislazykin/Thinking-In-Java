package com.ThinkingInJava.initializationAndCompletion;

class Tester {
    String s;

    {
        s = "Initializing string in Tester";
        System.out.println(s);
    }

    Tester() {
        System.out.println("Tester()");
    }
}

class InstanceClauseTest {
    public static void main(String[] args) {
        new Tester();
    }
}
