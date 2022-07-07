package com.ThinkingInJava.poly.music;

public class Stringed extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Stringed.play() " + note);
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        System.out.println("Stringed Wind");
    }
}
