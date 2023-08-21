package com.behavioral.observer;

import com.behavioral.observer.message.Message;

public class SubscriberTwo implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("SubscriberTwo: " + m.getMessage());
	}

}
