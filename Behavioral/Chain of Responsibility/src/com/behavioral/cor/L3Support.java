package com.behavioral.cor;

import com.behavioral.cor.request.SupportTicket;

public class L3Support implements Support {

	private Support handler = new L4Support();

	@Override
	public void handleTicket(SupportTicket ticket) {
		System.out.println("Ticket recieved by L3 Engineer!!");
		if (ticket.getLevel() == 3) {
			ticket.setResolved(true);
			ticket.setComments("Resolved by L3 Engineer!!");
			System.out.println("Ticket updated!!");
		} else {
			System.out.println("Forwarding the Ticket to L4 Engineer!!");
			handler.handleTicket(ticket);
		}
	}

}
