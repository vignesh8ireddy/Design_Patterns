package com.vignesh.singleton;

import com.vignesh.util.PrintUtil;

import java.io.Serial;

// A legacy style perfect singleton class
public class Printer4 extends PrintUtil {
    private static Printer4 INSTANCE;
    @Serial
    private static final long serialVersionUID = 1L;
    private static boolean isInstantiated = false;
    private Printer4() {

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

    //Preserving singleton nature in a multithreaded environment
    public static Printer4 getInstance() {
        if(INSTANCE == null) {
            synchronized (Printer4.class) {
                if(INSTANCE == null) {
                    INSTANCE = new Printer4();
                }
            }

        }
        return INSTANCE;
    }

    //Restricting cloning the singleton class
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning a singleton class is restricted");
    }

    //Restricting deserializing the singleton class
    @Serial
    public Object readResolve() {
        return INSTANCE;
    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }
}