package com.example.java_design.ch6;

public class TicketPrinter {
    private static TicketPrinter ticketPrinter = null;
    private final int maxCount = 10;

    protected TicketPrinter() {}

    public synchronized static TicketPrinter getInstance() {
        if(ticketPrinter == null) {
            ticketPrinter = new TicketPrinter();
        }

        return ticketPrinter;
    }

    public synchronized void printTicket(Ticket ticket, int count) {
        if(count > maxCount) {
            System.out.println("티켓 초가 구매");
            return;
        }

        if(ticket.getId().toString().charAt(0) == '0') {
            System.out.println("id 오류");
            return;
        }

        System.out.println(ticket.getId());
    }
}
