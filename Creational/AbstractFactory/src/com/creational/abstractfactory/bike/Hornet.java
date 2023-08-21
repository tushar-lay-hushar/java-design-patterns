package com.creational.abstractfactory.bike;

import com.creational.abstractfactory.vehicle.Vehicle;

public class Hornet implements Vehicle {

	private long engineNo;
	private String registrationNo;

	public Hornet(long engineNo, String registrationNo) {
		System.out.println("Manufacturing Hornet Bike....");
		System.out.println("Manufacturing Completed.");
		this.engineNo = engineNo;
		System.out.println("Engine No: " + engineNo);
		System.out.println("Registering Hornet Bike...");
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
		System.out.println("Starting Hornet Bike...");
	}

	@Override
	public void stop() {
		System.out.println("Switching off Hornet Bike...");
	}
	
}
