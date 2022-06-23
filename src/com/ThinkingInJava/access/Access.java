package com.ThinkingInJava.access;

public class Access {
    public int age;
    private String name;
    protected String country;

    public Access(int age, String name, String country) {
        this.age = age;
        this.name = name;
        this.country = country;
    }

    public void meth1() {
        System.out.println("im public");
    }

    private void meth2() {
        System.out.println("im private");
    }

    protected void meth3() {
        System.out.println("im protected");
    }
}

class AccessUse {
    public static void main(String[] args) {
        Access access = new Access(18, "Den", "RF");
        access.meth3();
    }
}
