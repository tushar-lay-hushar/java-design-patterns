package com.creational.abstractfactory;

import java.util.Random;

import com.creational.abstractfactory.car.City;
import com.creational.abstractfactory.car.Civic;
import com.creational.abstractfactory.vehicle.Vehicle;

public class CarFactory extends VehicleFactory {

	@Override
	public Vehicle getVehicle(String vehicleName) {
		Vehicle car = null;
		Random num = new Random();
		long engineNo = 849623000000l + num.nextInt(999999);
		String registrationNo = "MH-14-" + Character.valueOf((char)(65 + num.nextInt(27))).toString() + Character.valueOf((char)(65 + num.nextInt(27))).toString() + "-" + (1000 +num.nextInt(8999)); 
		
		if (vehicleName.equalsIgnoreCase("City"))
			car = new City(engineNo, registrationNo);
		else if (vehicleName.equalsIgnoreCase("Civic"))
			car = new Civic(engineNo, registrationNo);
		else
			throw new IllegalArgumentException("Car not in catalogue!!!");
		
		return car;
	}

}
