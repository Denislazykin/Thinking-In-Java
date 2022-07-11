package com.ThinkingInJava.poly.rodents;

public class Rodent {
    private String name = "Rodent";
    private Characteristic c = new Characteristic("has tail");
    private Description d = new Description("small mammal");
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Rodent(Shared shared) {
        System.out.println("Rodent()" + id);
        this.shared = shared;
        this.shared.addRef();
    }

    public void run() {
        System.out.println("Rodent.run();");
    }

    public void jump() {
        System.out.println("Rodent.jump();");
    }

    public void climb() {
        System.out.println("Rodent.climb();");
    }

    @Override
    public String toString() {
        return "Rodent{" +
                "name='" + name + '\'' +
                '}';
    }
}
