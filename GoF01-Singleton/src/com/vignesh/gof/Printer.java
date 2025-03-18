package com.vignesh.gof;

public class Printer {
    private static Printer INSTANCE;

    private Printer() {
        System.out.println("Printer:: 0-Parameter Constructor");
    }

    public static Printer getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Printer();
        }
        return INSTANCE;
    }

    /*public synchronized static Printer getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Printer();
        }
        return INSTANCE;
    }*/

    /*public static Printer getInstance() {
        synchronized (Printer.class) {
            if(INSTANCE == null) {
                INSTANCE = new Printer();
            }
        }
        return INSTANCE;
    }*/

    public void printMessage(String msg) {
        System.out.println(msg);
    }
}


/*

The above Printer class is implemented using minimum standards singleton design pattern.
The above singleton design pattern breaks in the following scenarios:
1. Multithreaded Environment
Solutions:
    i. Using synchronized factory method
    ii. Using synchronized block in the factory method

 */