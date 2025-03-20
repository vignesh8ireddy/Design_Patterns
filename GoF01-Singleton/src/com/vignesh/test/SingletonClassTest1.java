package com.vignesh.test;

import com.vignesh.singleton.Printer;

//This test case passes singleton design pattern
public class SingletonClassTest1 {

    public static void main(String[] args) {
        Printer p1 = Printer.getInstance();
        Printer p2 = Printer.getInstance();
        System.out.println("p1.hashCode():: "+p1.hashCode());
        System.out.println("p2.hashCode():: "+p2.hashCode());
        System.out.println("p1==p2:: "+(p1==p2));
        p1.printMessage("Erich | Richard | Ralph | John");
    }

}
