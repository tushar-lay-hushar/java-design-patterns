package com.behavioral.mediator;

import com.behavioral.mediator.collleague.User;

public interface ChatRoom {
	
	public void sendMessage(String msg, String userId);
	
	void addUser(User user);

}
