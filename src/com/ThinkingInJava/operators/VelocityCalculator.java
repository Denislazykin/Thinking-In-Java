package com.ThinkingInJava.operators;

class VelocityCalculator {
    static float velocity(float distance, float time) {
        return distance / time;
    }
}

class VelocityTester {
    public static void main(String[] args) {
        float distance = 565.3f;
        float time = 3.6f;
        System.out.println("Distance: " + distance);
        System.out.println("Time: " + time);
        float v = VelocityCalculator.velocity(distance, time);
        System.out.println("Velocity: " + v);
    }
}