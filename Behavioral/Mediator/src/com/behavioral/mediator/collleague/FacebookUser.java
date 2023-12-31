package com.behavioral.mediator.collleague;

import com.behavioral.mediator.ChatRoom;

public class FacebookUser extends User {

	public FacebookUser(ChatRoom room, String id, String name) {
		super(room, id, name);
	}

	@Override
	public void send(String msg, String userId) {
		System.out.println(this.getName() + ": Sending Message :" + msg);
		getMediator().sendMessage(msg, userId);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.getName() + ": Recieved Message :" + msg);
	}

}
