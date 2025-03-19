package com.vignesh.test;

import com.vignesh.gof.Printer;

import java.lang.reflect.Constructor;

//This test case fails singleton design pattern using Reflection API
public class SingletonClassTest6 {

    public static void main(String[] args) {
        try {
            Class printerClass = Class.forName("com.vignesh.gof.Printer");
            Constructor[] constructors = printerClass.getDeclaredConstructors();
            constructors[0].setAccessible(true);
            Printer p1 = (Printer) constructors[0].newInstance();
            Printer p2 = (Printer) constructors[0].newInstance();
            System.out.println("p1.hashCode():: "+p1.hashCode());
            System.out.println("p2.hashCode():: "+p2.hashCode());
            System.out.println("p1==p2:: "+(p1==p2));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}

/*
Output::

Printer:: 0-Parameter Constructor
Printer:: 0-Parameter Constructor
p1.hashCode():: 1747585824
p2.hashCode():: 764977973
p1==p2:: false
*/