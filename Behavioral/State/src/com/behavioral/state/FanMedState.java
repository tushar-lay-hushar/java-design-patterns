package com.behavioral.state;

import com.behavioral.state.context.Fan;

public class FanMedState implements State {

private Fan fan;
	
	public FanMedState(Fan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning fan on to High.");
		fan.setState(fan.getFanHighState());
	}
	
	@Override
	public String toString() {
		return "Fan is Med.";
	}

}
