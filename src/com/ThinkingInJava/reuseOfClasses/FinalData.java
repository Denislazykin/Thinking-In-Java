package com.ThinkingInJava.reuseOfClasses;

import java.util.Random;

class Value {
    int i; //доступ в пределах пакета

    public Value(int i) {
        this.i = i;
    }
}

public class FinalData {
    private static Random random = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    //Могут быть константами времени компиляции
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    // Типичная открытая константа
    public static final int VALUE_THREE = 39;
    // Не может быть константой времени компиляции
    private final int i4 = random.nextInt(20);
    static final int INT_5 = random.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private final Value VAL_3 = new Value(33);
    // Массивы
    private final int[] array = {1, 2, 3, 4, 5, 6};

    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData finalData = new FinalData("finalData");
        // finalData.valueone++; - значение нельзя изменить
        finalData.v2.i++; //объект не является измененным
        finalData.v1 = new Value(9); //ок, не является измененным
        for (int i = 0; i < finalData.array.length; i++) {
            finalData.array[i]++; // объект не является измененным
            //finalData.v2 = new Value(0);  -ошибка : ссылку
            //finalData.VAL_3 = new Value(1);  -нельзя изменить
            //finalData.array = new int[3];
            System.out.println(finalData);
            System.out.println(" Create FinalData");
            FinalData finalData1 = new FinalData("final data 1");
            System.out.println(finalData);
            System.out.println(finalData1);
        }
    }
}
