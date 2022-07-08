package com.ThinkingInJava.poly.music;

public class Instrument {
    public void play(Note note) {
        System.out.println("Instrument.play()" + note);
    }

    public String toString() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}
