package com.hralievsky.learning.design.patterns.behavioral.chain;

import com.hralievsky.learning.design.patterns.behavioral.chain.support.ChainedSupport;
import com.hralievsky.learning.design.patterns.behavioral.chain.support.LevelOneSupport;
import com.hralievsky.learning.design.patterns.behavioral.chain.support.LevelTwoSupport;
import com.hralievsky.learning.design.patterns.behavioral.chain.support.Manager;
import com.hralievsky.learning.design.patterns.behavioral.chain.ticket.Ticket;
import com.hralievsky.learning.design.patterns.behavioral.chain.ticket.TicketPriorities;

import java.util.Arrays;
import java.util.List;

/**
 * Customer Support Ticket Routing System
 * <p>
 * Context:
 * You are building a customer support system that needs to route support tickets to the appropriate support level based on ticket priority and complexity.
 * <p>
 * Requirements:
 * <p>
 * 1. Support levels: "Level1Support", "Level2Support", "Manager"
 * 2. Ticket priorities: "LOW", "MEDIUM", "HIGH", "CRITICAL"
 * 3. Routing rules:
 * - Level1Support: handles LOW and MEDIUM priority tickets
 * - Level2Support: handles HIGH priority tickets
 * - Manager: handles CRITICAL priority tickets
 * 4. If a support level cannot handle a ticket, it should pass it to the next level
 * 5. Log who processes each ticket
 * <p>
 * Demonstration:
 * Create tickets with different priorities and show them being routed through the chain until handled by the appropriate support level.
 */

public class Bootstrap {
    public static void main(String[] args) {
        String ticketDelimiter = "*---------------------------*";
        ChainedSupport l1 = new LevelOneSupport();
        ChainedSupport l2 = new LevelTwoSupport();
        ChainedSupport manager = new Manager();

        List<ChainedSupport> chain = Arrays.asList(l2, manager);

        SupportChain supportChain = new SupportChain(l1, chain);

        Ticket low = Ticket.create(TicketPriorities.LOW, "low ticket");
        Ticket high = Ticket.create(TicketPriorities.HIGH, "high ticket");
        Ticket medium = Ticket.create(TicketPriorities.MEDIUM, "medium ticket");
        Ticket critical = Ticket.create(TicketPriorities.CRITICAL, "critical ticket");

        List<Ticket> tickets = Arrays.asList(low, high, medium, critical);

        tickets.forEach(ticket -> {
            supportChain.handleTicket(ticket);
            System.out.println(ticketDelimiter);
        });

    }
}
