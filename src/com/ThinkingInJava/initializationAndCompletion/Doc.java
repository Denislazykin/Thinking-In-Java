package com.ThinkingInJava.initializationAndCompletion;

public class Doc {
    void intubate() {
        System.out.println("prepare patient");
        laryngoscopy();
        this.laryngoscopy();
    }

    void laryngoscopy() {
        System.out.println("use laryngoscope");
    }
}

class PassingThisEx {
    public static void main(String[] args) {
        new Doc().intubate();
    }
}