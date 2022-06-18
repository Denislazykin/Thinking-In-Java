package com.ThinkingInJava.initializationAndCompletion;
/*
Перечисления
 */
public enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING
}

class SimpleEnumUse{
    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);
    }
}

class EnumOrder{
    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}