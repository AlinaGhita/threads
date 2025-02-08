package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Gate {

    private final Queue<TicketType> ticketQueue = new LinkedList<>();

    public void addTicket(TicketType ticketType) {
        ticketQueue.add(ticketType);
    }

    public  List<TicketType> getTickets() {
        return new ArrayList<>(ticketQueue);
    }
}
