package com.behavioral.state;

import com.behavioral.state.context.Fan;

public class FanLowState implements State {

private Fan fan;
	
	public FanLowState(Fan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning fan on to Med.");
		fan.setState(fan.getFanMedState());
	}
	
	@Override
	public String toString() {
		return "Fan is Low.";
	}

}
