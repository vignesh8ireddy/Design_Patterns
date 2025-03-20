package com.vignesh.test;

import com.vignesh.singleton.Printer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//This test case fails singleton design pattern using serialization and deserialization
public class SingletonClassTest5 {

    public static String serialize(Printer printer) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Data.ser"))) {
            oos.writeObject(printer);
            oos.flush();
            System.out.println("Serialization Done!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return "Data.ser";
    }

    public static Printer deSerialize(String serFile) {
        Printer printer = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serFile))) {
            printer = (Printer) ois.readObject();
            System.out.println("DeSerialization Done!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return printer;
    }

    public static void main(String[] args) {
        Printer p1 = Printer.getInstance();
        String serFile = serialize(p1);
        Printer p2 = deSerialize(serFile);
        System.out.println("p1.hashCode():: "+p1.hashCode());
        System.out.println("p2.hashCode():: "+p2.hashCode());
        System.out.println("p1==p2:: "+(p1==p2));
    }

}

/*
Output::

Printer:: 0-Parameter Constructor
Serialization Done!
DeSerialization Done!
p1.hashCode():: 1299641336
p2.hashCode():: 1793329556
p1==p2:: false
 */