package org.example;

public class ParticipantsThread extends Thread{
    private final TicketType ticketType;
    private final Gate gate;

    public ParticipantsThread(TicketType ticketType, Gate gate) {
        this.ticketType = ticketType;
        this.gate = gate;
    }

    @Override
    public void run() {
        gate.addTicket(ticketType);
        System.out.println("Participant cu bilet " + ticketType + " a intrat.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {}
    }

}
