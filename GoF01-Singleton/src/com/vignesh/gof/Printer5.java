package com.vignesh.gof;

import com.vignesh.util.PrintUtil;

import java.io.Serial;

// A modern style perfect singleton class
public class Printer5 extends PrintUtil {

    @Serial
    private static final long serialVersionUID = 1L;
    private static boolean isInstantiated = false;

    private Printer5() {

        //Restricting Reflection API from creating more than one instance for the singleton class
        if(isInstantiated) {
            throw new RuntimeException("A singleton class instance has already created cannot create multiple " +
                    "instances.");
        }
        else {
            isInstantiated = true;
        }

        System.out.println("Printer4:: 0-Parameter Constructor");

    }

    private static class InnerPrinter5 {
        private static Printer5 INSTANCE = new Printer5();
    }

    public static Printer5 getInstance() {
        return InnerPrinter5.INSTANCE;
    }

    //Restricting cloning the singleton class
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning a singleton class is restricted");
    }

    //Restricting deserializing the singleton class
    @Serial
    public Object readResolve() {
        return InnerPrinter5.INSTANCE;
    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }
}