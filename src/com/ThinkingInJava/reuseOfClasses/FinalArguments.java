package com.ThinkingInJava.reuseOfClasses;

class Gizmo {
    public void spin() {
    }
}

public class FinalArguments {
    void with(final Gizmo gizmo) {
        // gizmo = new Gizmo(); -нет. тк gizmo - final
    }

    void wichOut(Gizmo gizmo) {
        gizmo = new Gizmo(); //ок, тк gizmo не final
        gizmo.spin();
    }

    /*
    void f(final int i) {
    i++;
     } -нельзя изменять, неизмененные примитивы доступны только для чтения
     */
    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments finalArguments = new FinalArguments();
        finalArguments.wichOut(null);
        finalArguments.with(null);
    }
}
