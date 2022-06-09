package com.ThinkingInJava.initializationAndCompletion;

class Aso {
    void bark() {
        System.out.println("woof");
    }
}

class AutomaticConstructor {
    public static void main(String[] args) {
        Aso a = new Aso();
        a.bark();
    }
}
