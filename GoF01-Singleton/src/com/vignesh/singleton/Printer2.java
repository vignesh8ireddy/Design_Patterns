package com.vignesh.singleton;

public class Printer2 {
    private static Printer2 INSTANCE = new Printer2();

    private Printer2() {
        System.out.println("Printer2:: 0-Parameter Constructor");
    }

    public static Printer2 getInstance() {
        return INSTANCE;
    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }
}


/*
The above Printer2 class preserves singleton nature in a multithreaded environment because,
private static Printer2 INSTANCE = new Printer2(); is atomic.

However, this approach creates an object for the singleton class even when not asked.
Creating an object whenever a class is loaded directly or indirectly is not a good practice.
 */