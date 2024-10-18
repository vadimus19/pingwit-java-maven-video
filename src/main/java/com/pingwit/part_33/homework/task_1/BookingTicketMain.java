package com.pingwit.part_33.homework.task_1;

public class BookingTicketMain {
    public static void main(String[] args) {
        TicketSystem ticketSystem = new TicketSystem();

        int totalBuyers = 15000;
        for (int i = 0; i < totalBuyers; i++) {
            final String buyerName = "Buyer" + i;
            new Thread(() -> ticketSystem.bookTicket(buyerName)).start();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
