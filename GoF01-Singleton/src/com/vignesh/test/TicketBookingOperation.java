package com.vignesh.test;

import com.vignesh.gof.Printer;

public class TicketBookingOperation implements Runnable{
    @Override
    public void run() {
        System.out.println("TicketBookingOperation.run()");
        Printer printer = Printer.getInstance();
        System.out.println("printer.hashCode():: "+printer.hashCode());
    }
}
