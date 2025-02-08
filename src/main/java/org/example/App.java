package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Gate gate = new Gate();
        new StatisticsThread(gate).start();

        for (int i = 0; i < 100; i++) {
            new ParticipantsThread(TicketType.getRandomTicket(), gate).start();
        }

    }
}


