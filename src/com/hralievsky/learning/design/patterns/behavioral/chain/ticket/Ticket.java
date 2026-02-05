package com.hralievsky.learning.design.patterns.behavioral.chain.ticket;

public class Ticket {
    private final TicketPriorities priorities;
    private final String description;

    private Ticket(TicketPriorities priorities, String description) {
        this.priorities = priorities;
        this.description = description;
    }

    public TicketPriorities getPriorities() {
        return priorities;
    }

    public String getDescription() {
        return description;
    }

    public static Ticket create(TicketPriorities priorities, String description) {
        return new Ticket(priorities, description);
    }
}
