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
        if(loggedIn)
            System.out.println("Error: still logged in");
        // Normally, you'll also do this:
        // super.finalize(); // Call the base-class version
    }
}

class TerminalCondition {
    public static void main(String[] args) {
        Duck duck = new Duck(true);
        Duck duck1 = new Duck(true);
        // Proper cleanup: log out of bank1 before going home
        duck.logOut();
        // Drop the reference, forget to cleanup:
        new Duck(true);
        // Force garbage collection and finalization:
        System.gc();
    }
}

