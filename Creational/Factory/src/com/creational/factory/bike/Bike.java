package com.creational.factory.bike;

public interface Bike {
	
	public long getEngineNo();
	public String getRegistrationNo();
	
	public void startEngine();
	public void ride();
	public void stopEngine();

}
