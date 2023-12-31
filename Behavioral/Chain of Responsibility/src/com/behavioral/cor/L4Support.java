package com.behavioral.cor;

import com.behavioral.cor.request.SupportTicket;

public class L4Support implements Support {
	
	private Support handler = new L5Support();

	@Override
	public void handleTicket(SupportTicket ticket) {
		System.out.println("Ticket recieved by L4 Engineer!!");
		if (ticket.getLevel() == 4) {
			ticket.setResolved(true);
			ticket.setComments("Resolved by L4 Engineer!!");
			System.out.println("Ticket updated!!");
		} else {
			System.out.println("Forwarding the Ticket to L5 Engineer!!");
			handler.handleTicket(ticket);
		}
	}
}
