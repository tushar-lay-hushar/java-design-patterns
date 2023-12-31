package com.behavioral.cor;

import com.behavioral.cor.request.SupportTicket;

public class L2Support implements Support {

	private Support handler = new L3Support();

	@Override
	public void handleTicket(SupportTicket ticket) {
		System.out.println("Ticket recieved by L2 Engineer!!");
		if (ticket.getLevel() == 2) {
			ticket.setResolved(true);
			ticket.setComments("Resolved by L2 Engineer!!");
			System.out.println("Ticket updated!!");
		} else {
			System.out.println("Forwarding the Ticket to L3 Engineer!!");
			handler.handleTicket(ticket);
		}
	}

}
