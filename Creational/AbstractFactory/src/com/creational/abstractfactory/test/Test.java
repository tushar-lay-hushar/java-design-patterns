package com.creational.abstractfactory.test;

import com.creational.abstractfactory.VehicleFactory;
import com.creational.abstractfactory.vehicle.Vehicle;

public class Test {

	public static void main(String[] args) {
		
		VehicleFactory vehicleFactory = VehicleFactory.getVehicleFactory("Car");
		Vehicle vehicle = vehicleFactory.getVehicle("City");
		vehicle.start();
		vehicle.stop();
		
		System.out.println();
		
		vehicleFactory = VehicleFactory.getVehicleFactory("Bike");
		vehicle = vehicleFactory.getVehicle("Hornet");
		vehicle.start();
		vehicle.stop();
	}
}
