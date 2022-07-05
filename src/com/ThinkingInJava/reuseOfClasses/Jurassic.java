package com.ThinkingInJava.reuseOfClasses;
class SmallBrain{}
final class Dinosaur{
    int i = 7;
    int j = 1;
    SmallBrain smallBrain = new SmallBrain();
    void f(){
        System.out.println("f()");
    }
}
//class Further extends Dinosaur {} - нельзя наследоваться от класса, который помечен как final
public class Jurassic {
    public static void main(String[] args) {
        Dinosaur dinosaur = new Dinosaur();
        dinosaur.f();
        dinosaur.i= 40;
        System.out.println(dinosaur.i);
        dinosaur.j++;
        System.out.println(dinosaur.j);
    }
}
