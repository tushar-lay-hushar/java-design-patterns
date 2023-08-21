package com.creational.abstractfactory.car;

import com.creational.abstractfactory.vehicle.Vehicle;

public class City implements Vehicle {
	
	private long engineNo;
	private String registrationNo;

	public City(long engineNo, String registrationNo) {
		System.out.println("Manufacturing City Car....");
		System.out.println("Manufacturing Completed.");
		this.engineNo = engineNo;
		System.out.println("Engine No: " + engineNo);
		System.out.println("Registering City Car...");
		this.registrationNo = registrationNo;
		System.out.println("Registeration Completed.");
		System.out.println("Registration No: " + registrationNo);
	}

	@Override
	public long getEngineNo() {
		return engineNo;
	}

	@Override
	public String getResgistrationNo() {
		return registrationNo;
	}

	@Override
	public void start() {
		System.out.println("Starting City Car...");
	}

	@Override
	public void stop() {
		System.out.println("Switching off City Car...");
	}
	
}
