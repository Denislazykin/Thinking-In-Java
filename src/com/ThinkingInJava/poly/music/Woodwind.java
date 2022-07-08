package com.ThinkingInJava.poly.music;

public class Woodwind extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("Woodwind.play() " + note);
    }

    @Override
    public String toString()  {
        return "Woodwind";
    }

}
