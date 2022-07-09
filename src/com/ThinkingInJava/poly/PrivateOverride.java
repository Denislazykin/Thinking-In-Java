package com.ThinkingInJava.poly;

public class PrivateOverride {
    private void f(){
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride privateOverride = new PrivateOverride();
        privateOverride.f();
    }
}
class Derived extends PrivateOverride{
    public void f(){
        System.out.println("public f()");
    }
}
