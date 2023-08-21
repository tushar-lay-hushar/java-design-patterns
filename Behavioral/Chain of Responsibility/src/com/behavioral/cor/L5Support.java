package com.behavioral.cor;

import com.behavioral.cor.request.SupportTicket;

public class L5Support implements Support {

	@Override
	public void handleTicket(SupportTicket ticket) {
		System.out.println("Ticket recieved by L5 Engineer!!");
		ticket.setResolved(true);
		ticket.setComments("Resolved by L5 Engineer!!");
		System.out.println("Ticket updated!!");
		
	}

}
