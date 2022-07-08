package com.ThinkingInJava.poly.music;

public class KeyboardInstrument extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("KeyboardInstrument.play() " + note);
    }

    @Override
    public String toString() {
        return "KeyboardInstrument";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting KeyboardInstrument");
    }
}
