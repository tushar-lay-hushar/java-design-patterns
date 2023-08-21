package com.behavioral.command;

import com.behavioral.command.appliances.Fan;

public class StartFan implements Switch {

	private Fan fan;
	
	public StartFan(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void turn() {
		fan.start();
	}

}
