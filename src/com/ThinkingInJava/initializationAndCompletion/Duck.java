package com.ThinkingInJava.initializationAndCompletion;

/**
 * Учимся применять finalize
 */
class Duck {
    boolean loggedIn = false;

    Duck(boolean logStatus) {
        loggedIn = logStatus;
    }

    void logIn() {
        loggedIn = true;
    }

    void logOut() {
        loggedIn = false;
    }

    protected void finalize() {
        if (loggedIn)
            System.out.println("Error: still logged in");
        // Normally, you'll also do this:
        // super.finalize(); // Call the base-class version
    }
}

class TerminalCondition {
    public static void main(String[] args) {
        Duck duck = new Duck(true);
        Duck duck1 = new Duck(true);
        // Proper cleanup: log out of duck before going home
        duck.logOut();
        // Forget to logout of duck1 and unnamed new duck
        // Attempts to finalize any missed ducks:
        System.out.println("Try 1: ");
        System.runFinalization();
        System.out.println("Try 2: ");
        Runtime.getRuntime().runFinalization();
        System.out.println("Try 3: ");
        System.gc();
        System.out.println("Try 4: ");
        // using deprecated since 1.1 method:
        System.runFinalization();
    }
}

