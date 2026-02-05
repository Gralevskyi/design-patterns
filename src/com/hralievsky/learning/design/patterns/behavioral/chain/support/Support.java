package com.hralievsky.learning.design.patterns.behavioral.chain.support;

import com.hralievsky.learning.design.patterns.behavioral.chain.ticket.Ticket;

public interface Support {
    void handleTicket(Ticket ticket);
}

