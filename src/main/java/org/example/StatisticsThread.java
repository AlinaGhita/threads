package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatisticsThread extends Thread{
    private final Gate gate;

    public StatisticsThread(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
                showStatistics();
            } catch (InterruptedException ignored) {
            }
        }

    }
    private void showStatistics () {
        List<TicketType> tickets = gate.getTickets();
        if (tickets.isEmpty()) return;

        Map<TicketType, Long> statistics = new HashMap<>();
        for (TicketType type : TicketType.values()) {
            statistics.put(type, tickets.stream().filter(t -> t == type).count());
        }

        System.out.println("\n--- Statistici ---");
        System.out.println("Particpanți: " + tickets.size());
        for (TicketType type : TicketType.values()) {
            System.out.println(type + ": " + statistics.get(type));
        }
    }

    public void startStatistics() {
        this.start();
    }

}
