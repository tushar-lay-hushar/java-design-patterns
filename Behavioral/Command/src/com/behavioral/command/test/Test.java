package com.behavioral.command.test;

import com.behavioral.command.StartFan;
import com.behavioral.command.StopFan;
import com.behavioral.command.TurnOffLight;
import com.behavioral.command.TurnOnLight;
import com.behavioral.command.appliances.Fan;
import com.behavioral.command.appliances.Light;
import com.behavioral.command.board.Button;

public class Test {

	public static void main(String[] args) {
		
		Light light = new Light();
		Fan fan = new Fan();
		
		Button button = new Button();
		
		button.setCommand(new TurnOnLight(light));
		button.pressButton();
		button.setCommand(new TurnOffLight(light));
		button.pressButton();
		button.setCommand(new StartFan(fan));
		button.pressButton();
		button.setCommand(new StopFan(fan));
		button.pressButton();
	}
}
