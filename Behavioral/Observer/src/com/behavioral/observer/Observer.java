package com.behavioral.observer;

import com.behavioral.observer.message.Message;

public interface Observer {
	
	public void update(Message m);
	
}
