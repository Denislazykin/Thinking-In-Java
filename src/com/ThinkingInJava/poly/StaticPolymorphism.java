package com.ThinkingInJava.poly;

class StaticSuper {
    public static String staticGet() {
        return "Base version staticGet()";
    }

    public String dynamicGet() {
        return "Base version dynamicGet()";
    }
}

class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Derived version staticGet()";
    }

    public String dynamicGet() {
        return "Derived version dynamicGet()";
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub(); //Up cast
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }
}
