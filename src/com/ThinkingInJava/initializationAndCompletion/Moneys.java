package com.ThinkingInJava.initializationAndCompletion;

public enum Moneys {
    ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}

class MoneysEnumOrder {
    public static void main(String[] args) {
        for (Moneys m : Moneys.values()) {
            System.out.println(m + ", ordinal " + m.ordinal());
        }
    }
}