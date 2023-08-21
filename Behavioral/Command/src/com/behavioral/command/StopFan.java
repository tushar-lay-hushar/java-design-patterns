package com.behavioral.command;

import com.behavioral.command.appliances.Fan;

public class StopFan implements Switch {
	
	private Fan fan;
	
	public StopFan(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void turn() {
		fan.stop();
	}

}
