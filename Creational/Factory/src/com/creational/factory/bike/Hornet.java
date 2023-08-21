package com.creational.factory.bike;

public class Hornet implements Bike {
	
	private long engineNo;
	private String registrationNo;
	
	public Hornet(long engineNo, String registrationNo) {
		System.out.println("Manufacturing Hornet Bike....");
		System.out.println("Manufacturing Completed.");
		this.engineNo = engineNo;
		System.out.println("Engine No: " + engineNo);
		System.out.println("Resgitering Hornet Bike...");
		this.registrationNo = registrationNo;
		System.out.println("Registeration Completed.");
		System.out.println("Registration No: " + registrationNo);
	}

	@Override
	public long getEngineNo() {
		return engineNo;
	}

	@Override
	public String getRegistrationNo() {
		return registrationNo;
	}

	@Override
	public void startEngine() {
		System.out.println("Starting Hornet Bike...");
	}

	@Override
	public void ride() {
		System.out.println("Riding Hornet Bike...");
	}

	@Override
	public void stopEngine() {
		System.out.println("Switching of Hornet Bike...");
	}

}
