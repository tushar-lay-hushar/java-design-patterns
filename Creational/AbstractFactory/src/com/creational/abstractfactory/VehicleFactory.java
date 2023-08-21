package com.creational.abstractfactory;

import com.creational.abstractfactory.vehicle.Vehicle;

public abstract class VehicleFactory {
	
	public static VehicleFactory getVehicleFactory(String type) {
		VehicleFactory vehicleFactory = null;
		
		if (type.equalsIgnoreCase("car"))
			vehicleFactory = new CarFactory();
		if (type.equalsIgnoreCase("bike"))
			vehicleFactory = new BikeFactory();
		return vehicleFactory;
	}
	
	public abstract Vehicle getVehicle(String vehicleName);

}
