package com.ThinkingInJava.reuseOfClasses.cadSystem;

public class Line extends Shape {
    private int start, end;

    public Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Draw line: " + start + ", " + end);
    }

    void dispose() {
        System.out.println("Erasing line: " + start + ", " + end);
    }
}
