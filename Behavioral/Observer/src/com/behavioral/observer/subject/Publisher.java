package com.behavioral.observer.subject;

import java.util.ArrayList;
import java.util.List;

import com.behavioral.observer.Observer;
import com.behavioral.observer.message.Message;

public class Publisher implements Subject {
	
	private List<Observer> observers = new ArrayList<>();

	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void dettach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyUpdate(Message m) {
		for (Observer o : observers) {
			o.update(m);
		}
	}

}
