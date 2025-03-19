package com.vignesh.test;

import com.vignesh.gof.Printer;

//This test case fails singleton design pattern using cloning
public class SingletonClassTest4 {

    public static void main(String[] args) {
        Printer p1 = Printer.getInstance();
        try {
            Printer p2 = (Printer) p1.clone();
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
p1.hashCode():: 1747585824
p2.hashCode():: 764977973
p1==p2:: false
*/