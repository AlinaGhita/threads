package org.example;

import java.util.Random;

public enum TicketType {
    FULL, FULL_VIP, FREE_PASS, ONE_DAY, ONE_DAY_VIP;

    public static TicketType getRandomTicket() {
        //generarea unui tip de bilet aleatoriu
        return values()[new Random().nextInt(values().length)];
    }
}
