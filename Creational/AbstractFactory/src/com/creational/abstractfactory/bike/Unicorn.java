package com.creational.abstractfactory.bike;

import com.creational.abstractfactory.vehicle.Vehicle;

public class Unicorn implements Vehicle {

	private long engineNo;
	private String registrationNo;

	public Unicorn(long engineNo, String registrationNo) {
		System.out.println("Manufacturing Unicorn Bike....");
		System.out.println("Manufacturing Completed.");
		this.engineNo = engineNo;
		System.out.println("Engine No: " + engineNo);
		System.out.println("Registering Unicorn Bike...");
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
		System.out.println("Starting Unicorn Bike...");
	}

	@Override
	public void stop() {
		System.out.println("Switching off Unicorn Bike...");
	}
	
}
