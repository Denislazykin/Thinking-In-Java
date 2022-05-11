package com.ThinkingInJava;

public class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;

    void changeTheHueOfTheColor(int newHue) {
        System.out.println(newHue);
    }

    public static void main(String[] args) {
        AllTheColorsOfTheRainbow rainbow = new AllTheColorsOfTheRainbow();
        rainbow.changeTheHueOfTheColor(12);
    }
}
