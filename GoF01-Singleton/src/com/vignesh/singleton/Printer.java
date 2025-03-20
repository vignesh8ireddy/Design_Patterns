package com.vignesh.singleton;

import com.vignesh.util.PrintUtil;

import java.io.Serial;

//A minimum standards singleton class
public class Printer extends PrintUtil {
    private static Printer INSTANCE;
    @Serial
    private static final long serialVersionUID = 1L;
    private static boolean isInstantiated = false;
    private Printer() {

        //Restricting Reflection API from creating more than one instance for the singleton class
        /*if(isInstantiated) {
            throw new RuntimeException("A singleton class instance has already created cannot create multiple " +
                    "instances.");
        }
        else {
            isInstantiated = true;
        }*/

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

    //This is the best way of creating instance for preserving singleton nature in a multithreaded environment
    /*public static Printer getInstance() {
        if(INSTANCE == null) {
            synchronized (Printer.class) {
                if(INSTANCE == null) {
                    INSTANCE = new Printer();
                }
            }

        }
        return INSTANCE;
    }*/

    //Restricting cloning the singleton class
    /*@Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning a singleton class is restricted");
    }*/

    //Restricting cloning the singleton class
    /*@Override
    public Object clone() throws CloneNotSupportedException {
        return INSTANCE;
    }*/

    //Restricting deserializing the singleton class
    /*@Serial
    public Object readResolve() {
        return INSTANCE;
    }*/

    //Restricting deserializing the singleton class
    /*@Serial
    public Object readResolve() {
        throw new RuntimeException("DeSerializing a singleton class is restricted");
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
    i. Using synchronized factory method.
    ii. Using synchronized block in the factory method.
    iii. Using synchronized block along with double null checking.
    iv. Using eager instantiation (Printer2 class)
    v. Using inner class based lazy instantiation (Printer3 class)
2. Cloning
Solution: Override clone() method of Object class in the singleton class and restricting cloning.
3. Serializing and Deserializing
Solution: Write the readResolve() method in the singleton class restricting its Deserializing.
4. Using Reflection API
Solution: In the private constructor check if an instance is already available or not and accordingly throw
RuntimeException.
5. Using Custom Class Loader
 */