package com.behavioral.cor.test;

import com.behavioral.cor.L1Support;
import com.behavioral.cor.Support;
import com.behavioral.cor.request.SupportTicket;

public class Test {

	public static void main(String[] args) {
		
		SupportTicket ticket = new SupportTicket();
		ticket.setLevel(5);
		
		Support support = new L1Support();
		
		support.handleTicket(ticket);
		
		System.out.println();
		System.out.println("Ticket level: " + ticket.getLevel());
		System.out.println("Ticket comments: " + ticket.getComments());
		System.out.println("Ticket resolved: " + ticket.isResolved());
		
	}

}
