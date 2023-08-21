package com.behavioral.command;

import com.behavioral.command.appliances.Light;

public class TurnOffLight implements Switch {

private Light light;
	
	public TurnOffLight(Light light) {
		this.light = light;
	}

	@Override
	public void turn() {
		light.turnOff();
	}

}
