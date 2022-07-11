package com.ThinkingInJava.poly.referenceCounting;

public class ReferenceCounting {
    @SuppressWarnings("FinalizeCalledExplicitly")
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared)};
        for (Composing composing : composings) {
            composing.dispose();
        }
        System.out.println();
        Composing compTest = new Composing(shared);
        Composing compTest2 = new Composing(shared);
        // Test finalize():
        shared.finalize();
        Shared sharedTest = new Shared();
        Composing compTest3 = new Composing(sharedTest);
        // Test sharedTest finalize():
        sharedTest.finalize();
    }
}
