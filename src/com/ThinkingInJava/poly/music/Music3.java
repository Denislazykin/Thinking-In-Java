package com.ThinkingInJava.poly.music;

import static com.ThinkingInJava.poly.music.Note.C_SHARP;

/*
Работа метода не зависит от фактического типа объекта,
поэтому типы, добавленные в систему, будут работать правильно
 */
public class Music3 {
    private static final RandomInstrumentGenerator rig = new RandomInstrumentGenerator();

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
        System.out.println();
        // создаю массив куда рандомно добавляю интсрументы
        Instrument[] instruments = new Instrument[30];
        for (int i = 0; i < instruments.length; i++) {
            instruments[i] = rig.next();
        }
        //вывожу на экран, то что добавилось в массив
        for (Instrument instrument : instruments) {
            instrument.play(C_SHARP);
            instrument.toString();
            instrument.adjust();
        }
    }
}
