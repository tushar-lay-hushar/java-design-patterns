package com.behavioral.mediator.test;

import com.behavioral.mediator.ChatRoom;
import com.behavioral.mediator.FacebookChatRoom;
import com.behavioral.mediator.collleague.FacebookUser;
import com.behavioral.mediator.collleague.User;

public class Test {

	public static void main(String[] args) {
		
		ChatRoom chatRoom = new FacebookChatRoom();
		
		User tushar = new FacebookUser(chatRoom, "1", "Tushar");
		User swapnil = new FacebookUser(chatRoom, "2", "Swapnil");
		
		chatRoom.addUser(tushar);
		chatRoom.addUser(swapnil);
		
		tushar.send("Hello", "2");
		swapnil.send("Hii", "1");
	}

}
