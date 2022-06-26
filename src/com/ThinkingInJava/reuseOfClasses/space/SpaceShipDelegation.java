package com.ThinkingInJava.reuseOfClasses.space;

public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    // делеируем методы с помощью объека controls
    void up(int velocity) {
        controls.up(velocity);
    }

    void down(int velocity) {
        controls.down(velocity);
    }

    void left(int velocity) {
        controls.left(velocity);
    }

    void right(int velocity) {
        controls.right(velocity);
    }

    void forward(int velocity) {
        controls.forward(velocity);
    }

    void back(int velocity) {
        controls.back(velocity);
    }

    void turboBoost() {
        controls.turboBoost();
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
        protector.forward(100);
    }
}
