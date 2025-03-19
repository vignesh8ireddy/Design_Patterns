package com.vignesh.gof;

public class Printer3 {

    private Printer3() {
        System.out.println("Printer3:: 0-Parameter Constructor");
    }

    private static class InnerPrinter3 {
        private static Printer3 INSTANCE = new Printer3();
    }

    public static Printer3 getInstance() {
        return InnerPrinter3.INSTANCE;
    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }
}


/*
The above Printer3 class preserves singleton nature in a multithreaded environment because,
private static Printer3 INSTANCE = new Printer3(); is atomic.

This best alternative for Printer2 class since instance for Printer3 is created only when getInstance()
method is called and not whenever Printer3 class is loaded.
 */