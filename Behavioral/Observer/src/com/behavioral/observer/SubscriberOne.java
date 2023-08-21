package com.behavioral.observer;

import com.behavioral.observer.message.Message;

public class SubscriberOne implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("SubscriberOne: " + m.getMessage());
	}

}
