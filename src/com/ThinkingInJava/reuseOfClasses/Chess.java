package com.ThinkingInJava.reuseOfClasses;

class Game {
    Game(int i) {
        System.out.println("Game's constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}

public class Chess extends BoardGame {
    Chess() {
        /* print("BoardGame constructor");  call to super must be first statement in constructor,
        else: "cannot find symbol: constructor Game() */
        super(1);
        System.out.println("Chess's constructor");
    }

    public static void main(String[] args) {
        Chess chess = new Chess();
    }
}
