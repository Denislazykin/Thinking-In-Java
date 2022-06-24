package com.ThinkingInJava.access;

public class ConnectionManager {

    static int howManyLeft = 3;
    static Connection[] ca = new Connection[3];

    {
        for (Connection x : ca)
            x = Connection.makeConnection();
    }

    public static Connection getConnection() {
        if (howManyLeft > 0)
            return ca[--howManyLeft];
        else {
            System.out.println("No more connections");
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(Connection.makeConnection());

    }
}

class Connection {
    private static int count = 0;
    private int i = 0;

    private Connection() {
        System.out.println("Connection()");
    }

    // Создаем объекты с помощью метода
    static Connection makeConnection() {
        count++;
        return new Connection();
    }

    public static int howMany() {
        return count;
    }

    public String toString() {
        return ("Connection " + count);
    }
}

