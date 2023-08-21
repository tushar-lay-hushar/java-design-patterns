package com.behavioral.state;

import com.behavioral.state.context.Fan;

public class FanHighState implements State {

private Fan fan;
	
	public FanHighState(Fan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning off fan.");
		fan.setState(fan.getFanOffState());
	}
	
	@Override
	public String toString() {
		return "Fan is High.";
	}

}
