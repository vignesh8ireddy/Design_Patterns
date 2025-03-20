package com.vignesh.singleton;

// An Enum style singleton class
public enum Printer6 {
    INSTANCE; //Enum Constant, internally this is public static Printer6 INSTANCE = new Printer6();

    public static Printer6 getInstance() {
        return INSTANCE;
    }
    public void printMessage(String msg) {
        System.out.println(msg);
    }
}

/*
* Because of the eager instantiation, singleton is preserved in multithreaded environment.
* clone() is protected final method in the internal default super class of every enum, so clone() cannot be overridden
in enum, ergo an enum cannot be cloned.
* Every enum is serializable by default but when we attempt to deserialize any enum we get already available object i.e
enum constant. So singleton is preserved in the context of serialization and deserialization.
* An enum doesn't have constructor, so reflection api cannot break singleton.
 */