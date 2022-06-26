package com.ThinkingInJava.reuseOfClasses.detergent;

class Sterilizer extends Detergent {
    public void scrub() {
        append(" Sterilizer.scrub()");
        super.scrub();
    }

    public void sterilize() {
        append(" sterilize()");
    }

    public static void main(String[] args) {
        Sterilizer s = new Sterilizer();
        s.dilute();
        s.apply();
        s.scrub();
        s.foam();
        s.sterilize();
        System.out.println(s);
        System.out.println("Testing base class:");
        Detergent.main(args);
    }
}
