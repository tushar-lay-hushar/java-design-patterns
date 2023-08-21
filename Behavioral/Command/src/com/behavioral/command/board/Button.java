package com.behavioral.command.board;

import com.behavioral.command.Switch;

public class Button {
	
	private Switch command;
	
	public void setCommand(Switch command) {
		this.command = command;
	}
	
	public void pressButton() {
		command.turn();
	}

}
