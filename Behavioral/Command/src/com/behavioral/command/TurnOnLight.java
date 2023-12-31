package com.behavioral.command;

import com.behavioral.command.appliances.Light;

public class TurnOnLight implements Switch {
	
	private Light light;
	
	public TurnOnLight(Light light) {
		this.light = light;
	}

	@Override
	public void turn() {
		light.turnOn();
	}

}
