package com.pingwit.part_33.homework.task_1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class TicketSystem {
    private static final int TOTAL_TICKETS = 10000;
    private AtomicInteger ticketsLeft = new AtomicInteger(TOTAL_TICKETS);
    private ReentrantLock lock = new ReentrantLock();

    public void bookTicket(String buyerName) {
        lock.lock();
        try {
            if (ticketsLeft.get() > 0) {
                int remainingTickets = ticketsLeft.decrementAndGet();
                System.out.println("Buyer " + buyerName + " bocked tickets. Tickets left: " + remainingTickets);
            } else {
                System.out.println("Buyer " + buyerName + " Unfortunately all tickets are sold out.You received 5% a discount on next concert ");
            }
        } finally {
            lock.unlock();
        }
    }
}