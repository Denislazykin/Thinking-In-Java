package com.ThinkingInJava.poly.music;

public class Brass extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("Brass.play() " + note);
    }

    @Override
    public String toString() {
        return "Brass";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}
