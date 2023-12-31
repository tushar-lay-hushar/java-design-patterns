package com.behavioral.observer.subject;

import com.behavioral.observer.Observer;
import com.behavioral.observer.message.Message;

public interface Subject {
	
	public void attach(Observer o);
	public void dettach(Observer o);
	public void notifyUpdate(Message m);
	
}
