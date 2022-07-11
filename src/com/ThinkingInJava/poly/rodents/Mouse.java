package com.ThinkingInJava.poly.rodents;

public class Mouse extends Rodent {
    private String name = "Mouse";
    private Characteristic c = new Characteristic("like cheese");
    private Description d = new Description("nocturnal");

    public Mouse(Shared shared) {
        super(shared);
        System.out.println("Mouse()");
    }

    @Override
    public void run() {
        System.out.println("Mouse.run();");
    }

    @Override
    public void jump() {
        System.out.println("Mouse.jump();");
    }

    @Override
    public void climb() {
        System.out.println("Mouse.climb();");
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                '}';
    }
}
