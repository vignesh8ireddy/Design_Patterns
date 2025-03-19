package com.vignesh.test;

import com.vignesh.gof.Printer;

//This test case in multithreaded environment fails, singleton design pattern is broken here
public class SingletonClassTest2 {
    public static void main(String[] args) {
        TicketBookingOperation operation = new TicketBookingOperation();
        Thread t1 = new Thread(operation);
        Thread t2 = new Thread(operation);
        Thread t3 = new Thread(operation);

        t1.start();
        t2.start();
        t3.start();
    }

}

class TicketBookingOperation implements Runnable{
    @Override
    public void run() {
        System.out.println("TicketBookingOperation.run()");
        Printer printer = Printer.getInstance();
        System.out.println("printer.hashCode():: "+printer.hashCode());
    }
}

/*
Output::

TicketBookingOperation.run()
TicketBookingOperation.run()
TicketBookingOperation.run()
Printer:: 0-Parameter Constructor
Printer:: 0-Parameter Constructor
Printer:: 0-Parameter Constructor
printer.hashCode():: 182727097
printer.hashCode():: 733032819
printer.hashCode():: 1061706323
 */