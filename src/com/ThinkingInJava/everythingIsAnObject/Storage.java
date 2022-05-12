package com.ThinkingInJava.everythingIsAnObject;

public class Storage {
    /**
     * Сколько байт потребуется для хранения данных
     * определенной строки
     * @param s строка, содержащая символы, которые нужно расчитать
     * @return количество символов в строке
     */
    int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        Storage storage = new Storage();
        System.out.println(storage.storage("9"));
    }
}
