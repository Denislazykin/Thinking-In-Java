package com.ThinkingInJava.poly.music;

public class Music2 {
    public static void tune (Wind i){
        i.play(Note.MIDDLE_C);
    }

    public static void tune (Stringed i){
        i.play(Note.C_SHARP);
    }

    public static void tune (Brass i){
        i.play(Note.B_FLAT);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute); //без восходящего преобразования
        tune(violin);
        tune(frenchHorn);
    }
}
