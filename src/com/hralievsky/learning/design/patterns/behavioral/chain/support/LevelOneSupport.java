package com.hralievsky.learning.design.patterns.behavioral.chain.support;

import com.hralievsky.learning.design.patterns.behavioral.chain.ticket.Ticket;
import com.hralievsky.learning.design.patterns.behavioral.chain.ticket.TicketPriorities;

public class LevelOneSupport extends ChainedSupport {

    @Override
    protected void process(Ticket ticket) {
        System.out.println(LevelOneSupport.class.getSimpleName() + " processing ticket with priorities " + ticket.getPriorities().name() + ": " + ticket.getDescription());
    }

    @Override
    protected boolean canHandle(Ticket ticket) {
        return ticket.getPriorities() == TicketPriorities.LOW ||
               ticket.getPriorities() == TicketPriorities.MEDIUM;
    }
}
