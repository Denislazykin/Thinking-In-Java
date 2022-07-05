package com.ThinkingInJava.reuseOfClasses;

class Instrument {
    public void play(){};
    static void tune(Instrument i){
        i.play();
    }
}
/*
Объекты Wind так же явлдяются объектами Instrument
поскольку они имеют тот же интерфейс
 */
public class Wind extends Instrument{
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}
