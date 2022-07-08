package com.ThinkingInJava.poly.music;

import java.util.Random;

/*
Фабрика, случайным образом создающая инструменты
 */
public class RandomInstrumentGenerator {
    private Random random = new Random();

    public Instrument next(){
        switch (random.nextInt(7)) {
            default:
            case 0:
                return new Brass();
            case 1:
                return new KeyboardInstrument();
            case 2:
                return new Percussion();
            case 3:
                return new Piano();
            case 4:
                return new Stringed();
            case 5:
                return new Wind();
            case 6:
                return new Woodwind();
        }
    }
}
