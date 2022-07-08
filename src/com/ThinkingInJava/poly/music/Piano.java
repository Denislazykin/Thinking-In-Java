package com.ThinkingInJava.poly.music;

public class Piano extends KeyboardInstrument{
    @Override
    public void play(Note note) {
        System.out.println("Piano.play() " + note);
    }

    @Override
    public String toString() {
        return "Piano";
    }

    @Override
    void adjust() {
        System.out.println("Piano Stringed");
    }
}
