package com.behavioral.cor;

import com.behavioral.cor.request.SupportTicket;

public class L1Support implements Support {

	private Support handler = new L2Support();

	@Override
	public void handleTicket(SupportTicket ticket) {
		System.out.println("Ticket recieved by L1 Engineer!!");
		if (ticket.getLevel() == 1) {
			ticket.setResolved(true);
			ticket.setComments("Resolved by L1 Engineer!!");
			System.out.println("Ticket updated!!");
		} else {
			System.out.println("Forwarding the Ticket to L2 Engineer!!");
			handler.handleTicket(ticket);
		}
	}

}
