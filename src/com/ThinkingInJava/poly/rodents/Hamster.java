package com.ThinkingInJava.poly.rodents;

public class Hamster extends Rodent {
    private String name = "Hamster";
    private Characteristic c = new Characteristic("big cheeks");
    private Description d = new Description("spinning the wheel");

    public Hamster(Shared shared) {
        super(shared);
        System.out.println("Hamster()");
    }

    @Override
    public void run() {
        System.out.println("Hamster.run();");
    }

    @Override
    public void jump() {
        System.out.println("Hamster.jump();");
    }

    @Override
    public void climb() {
        System.out.println("Hamster.climb();");
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "name='" + name + '\'' +
                '}';
    }
}
