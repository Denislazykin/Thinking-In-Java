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

class Wallet {
    Moneys moneys;

    public static void main(String[] args) {
        for (Moneys moneys : Moneys.values()) {
            System.out.print("Nominal value: ");
            switch (moneys) {
                case ONE:
                    System.out.println("$1");
                    break;
                case FIVE:
                    System.out.println("$5");
                    break;
                case TEN:
                    System.out.println("$10");
                    break;
                case TWENTY:
                    System.out.println("$20");
                    break;
                case FIFTY:
                    System.out.println("$50");
                    break;
                case HUNDRED:
                    System.out.println("$100");
                    break;
                default:
                    break;
            }
        }
    }
}