package com.ThinkingInJava.everythingIsAnObject;

import java.util.*;

// object/Documentation4.java
/**
 * Вы даже можете вставить список:
 * <ol>
 * <li> Item one
 * <li> Item two
 * <li> Item three
 * </ol>



 * Another test list
 * <ol>
 * <li> One
 * <li> Two
 * <li> Three
 * </ol>
 */

public class Documentation4 {

    /** Давайте попробуем создать список общедоступных полей
     * <ol>
     * <li> One
     * <li> Two
     * <li> Three
     * </ol>
     */

    public int i = 2;

    /**
     * Список закрытых полей (-приватный для просмотра)
     * <ol>
     * <li> One
     * <li> Two
     * <li> Three
     * </ol>
     */

    private int j = 3;

    /**
     Другой список может быть вставлен здесь, чтобы помочь объяснить
     * следующий вызов метода
     * <ol>
     * <li> One
     * <li> Two
     * <li> Three
     * </ol><br>
     * но может быть отформатирован по-другому в Сводке методов
     */

    public static void main(String[] args) {

        /**
         * Давайте попробуем другой тестовый список здесь
         * <ol>
         * <li> One
         * <li> Two
         * <li> Three
         * </ol>
         */

        Date d = new Date();
        System.out.println("d = " + d);
    }
}

