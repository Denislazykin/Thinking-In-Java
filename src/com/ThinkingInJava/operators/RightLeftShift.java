package com.ThinkingInJava.operators;
/*
Двигаем влево, а затем вправо по всем позициям
 */
public class RightLeftShift {
    public static void main(String [] args) {
        int h = -1;
        System.out.println(Integer.toBinaryString(h));
        h <<= 10;
        System.out.println(Integer.toBinaryString(h));
        for(int i = 0; i < 32; i++) {
            h >>>= 1;
            System.out.println(Integer.toBinaryString(h));
        }
    }
}
