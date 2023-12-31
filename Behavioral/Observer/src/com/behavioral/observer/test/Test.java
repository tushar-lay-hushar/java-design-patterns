package com.behavioral.observer.test;

import com.behavioral.observer.Observer;
import com.behavioral.observer.SubscriberOne;
import com.behavioral.observer.SubscriberTwo;
import com.behavioral.observer.message.Message;
import com.behavioral.observer.subject.Publisher;
import com.behavioral.observer.subject.Subject;

public class Test {

	public static void main(String[] args) {
		
		Observer subscriberOne = new SubscriberOne();
		Observer subscriberTwo = new SubscriberTwo();
		
		Subject publisher = new Publisher();
		
		publisher.attach(subscriberOne);
		publisher.attach(subscriberTwo);
		
		publisher.notifyUpdate(new Message("First Message"));
		publisher.notifyUpdate(new Message("Second Message"));
	}
}
