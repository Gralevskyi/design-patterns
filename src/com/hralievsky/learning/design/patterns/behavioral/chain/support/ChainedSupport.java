package com.hralievsky.learning.design.patterns.behavioral.chain.support;

import com.hralievsky.learning.design.patterns.behavioral.chain.ticket.Ticket;

public abstract class ChainedSupport implements Support, ChainItem {
    private Support next;

    @Override
    public void addNext(Support next) {
        this.next = next;
    }

    @Override
    public void handleTicket(Ticket ticket) {
        if (canHandle(ticket)) {
            process(ticket);
        } else if (next != null) {
            next.handleTicket(ticket);
        } else {
            throw new IllegalStateException("Next is null");
        }
    }

    protected abstract void process(Ticket ticket);

    protected abstract boolean canHandle(Ticket ticket);
}
