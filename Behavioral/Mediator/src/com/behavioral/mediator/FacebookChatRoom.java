package com.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

import com.behavioral.mediator.collleague.User;

public class FacebookChatRoom implements ChatRoom {
	
	private Map<String, User> users = new HashMap<>();

	@Override
	public void sendMessage(String msg, String userId) {
		User user = this.users.get(userId);
		user.receive(msg);
	}

	@Override
	public void addUser(User user) {
		this.users.put(user.getId(), user);
	}

}
