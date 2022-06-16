package com.ThinkingInJava.initializationAndCompletion;

/**
 * Учимся применять finalize
 */
class Duck {
    boolean checkedOut = false;

    Duck(boolean checkedOut) {
        checkedOut = checkedOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    public void finalise() {
        if (checkedOut) {
            System.out.println("Error: checkedOut");
        }
    }
}

class TerminalCondition {
    public static void main(String[] args) {
        Duck scruj = new Duck(true);
        //Correct clean
        scruj.checkIn();
        //Lost the link, forgot about clean
        new Duck(true);
        //Forced clean and finalize
        System.gc();
    }
}

