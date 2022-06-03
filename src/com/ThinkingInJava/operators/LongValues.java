package com.ThinkingInJava.operators;

/*
16ричная и 8ричная записи могут использоваться с типом long
 */
public class LongValues {
    public static void main(String[] args) {
        long n1 = 0xabcd;
        long n2 = 012345;
        System.out.println("long n1 in hex = " + Long.toBinaryString(n1));
        System.out.println("long n2 in oct = " + Long.toBinaryString(n2));
    }
}
