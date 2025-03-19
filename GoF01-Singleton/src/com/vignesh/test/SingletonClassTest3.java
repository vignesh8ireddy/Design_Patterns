package com.vignesh.test;

import com.vignesh.gof.Printer2;
//import com.vignesh.gof.Printer3;

//This test case passes Printer2 singleton class (and also Printer3 singleton class)
public class SingletonClassTest3 {
    public static void main(String[] args) {
        TicketBookingOperation2 operation2 = new TicketBookingOperation2();
        Thread t1 = new Thread(operation2);
        Thread t2 = new Thread(operation2);
        Thread t3 = new Thread(operation2);

        t1.start();
        t2.start();
        t3.start();
    }
}

class TicketBookingOperation2 implements Runnable{
    @Override
    public void run() {
        System.out.println("TicketBookingOperation2.run()");
        Printer2 printer = Printer2.getInstance();
        //Printer3 printer = Printer3.getInstance();
        System.out.println("printer.hashCode():: "+printer.hashCode());
    }
}

/*
Output::

TicketBookingOperation2.run()
TicketBookingOperation2.run()
TicketBookingOperation2.run()
Printer2:: 0-Parameter Constructor
printer.hashCode():: 628546165
printer.hashCode():: 628546165
printer.hashCode():: 628546165
 */