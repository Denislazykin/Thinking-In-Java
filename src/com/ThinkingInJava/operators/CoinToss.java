package com.ThinkingInJava.operators;

import java.util.Random;

/*
Программа моделирует бросок монеты
 */
public class CoinToss {

    public static void main(String[] args) {
        Random random = new Random();
        int coin = random.nextInt();
        if (coin % 2 == 0) {
            System.out.println("heads");
        } else {
            System.out.println("tail");
        }
    }
}
