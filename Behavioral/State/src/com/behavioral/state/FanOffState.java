package com.behavioral.state;

import com.behavioral.state.context.Fan;

public class FanOffState implements State {
	
	private Fan fan;
	
	public FanOffState(Fan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning fan on to low.");
		fan.setState(fan.getFanLowState());
	}
	
	@Override
	public String toString() {
		return "Fan is off.";
	}

}
