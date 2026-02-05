package com.hralievsky.learning.design.patterns.behavioral.chain;

import com.hralievsky.learning.design.patterns.behavioral.chain.support.ChainedSupport;
import com.hralievsky.learning.design.patterns.behavioral.chain.support.Support;
import com.hralievsky.learning.design.patterns.behavioral.chain.ticket.Ticket;

import java.util.List;

public class SupportChain implements Support {
    private ChainedSupport header;

    public SupportChain(ChainedSupport header, List<ChainedSupport> chain) {
        this.header = header;

        ChainedSupport tempHeader = header;
        for (ChainedSupport support : chain) {
            tempHeader.addNext(support);
            tempHeader = support;
        }
    }

    @Override
    public void handleTicket(Ticket ticket) {
        header.handleTicket(ticket);
    }
}
