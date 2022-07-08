package com.ThinkingInJava.poly.music;

/*
Работа метода не зависит от фактического типа объекта,
поэтому типы, добавленные в систему, будут работать правильно
 */
public class Music3 {
    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument instrument : e) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        Instrument guitar = new Stringed();
        //Восходящее преобразование при добавлении в массив:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new KeyboardInstrument(),
                new Piano()
        };
        tune(guitar);
        System.out.println();
        tuneAll(orchestra);
        System.out.println();
        for (Instrument instrument : orchestra) {
            System.out.println(instrument);
        }
    }
}
