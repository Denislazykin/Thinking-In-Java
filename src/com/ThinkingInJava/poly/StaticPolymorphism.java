package com.ThinkingInJava.poly;

class StaticSuper{
    public static String staticGet(){
        return "Base version staticGet()";
    }
    public String dynamicGet(){
        return "Base version dynamicGet()";
    }
}
class StaticSub extends StaticSuper{
    public static String staticGet(){
        return "Derived version staticGet()";
    }
    public String dynamicGet(){
        return "Derived version dynamicGet()";
    }
}
public class StaticPolymorphism {
}
