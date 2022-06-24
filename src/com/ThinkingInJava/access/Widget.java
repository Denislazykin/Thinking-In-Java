package com.ThinkingInJava.access;

public class Widget {
    public Widget() {
        System.out.println("Constructor Widget()");
    }
}

class MakeWidget {
    public static void main(String[] args) {
        Widget w = new Widget();
    }
}
